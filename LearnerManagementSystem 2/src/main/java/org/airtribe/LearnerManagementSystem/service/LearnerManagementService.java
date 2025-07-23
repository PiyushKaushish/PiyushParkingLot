package org.airtribe.LearnerManagementSystem.service;

import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.airtribe.LearnerManagementSystem.entity.Cohort;
import org.airtribe.LearnerManagementSystem.entity.Course;
import org.airtribe.LearnerManagementSystem.entity.Learner;
import org.airtribe.LearnerManagementSystem.entity.PagedResponse;
import org.airtribe.LearnerManagementSystem.exception.LearnerNotFoundException;
import org.airtribe.LearnerManagementSystem.repository.CohortRepository;
import org.airtribe.LearnerManagementSystem.repository.CourseRepository;
import org.airtribe.LearnerManagementSystem.repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class LearnerManagementService {

  @Autowired
  private LearnerRepository _learnerRepository;

  @Autowired
  private CohortRepository _cohortRepository;

  @Autowired
  private CourseRepository _courseRepository;

  public Learner createLearner(Learner learner) {
     return _learnerRepository.save(learner);
  }

  public List<Learner> fetchAllLearners() {
    return _learnerRepository.findAll();
  }

  public Learner fetchLearnerByLearnerId(Long learnerId) throws LearnerNotFoundException {
    Optional<Learner> learnerOptional = _learnerRepository.findById(learnerId);

    if (learnerOptional.isPresent()) {
      return learnerOptional.get();
    }


    throw new LearnerNotFoundException("Learner not found with ID: " + learnerId);
  }

  public Learner fetchLearnerByName(String learnerName) {
    return _learnerRepository.findByLearnerName(learnerName);
  }

  public Cohort createCohort(Cohort cohort) {
    return _cohortRepository.save(cohort);
  }

  public Cohort assignLearnersToCohort(Long learnerId, Long cohortId) {
    Optional<Cohort> fetchedCohort = _cohortRepository.findById(cohortId);
    Optional<Learner> fetchedLearner = _learnerRepository.findById(learnerId);
    Cohort cohort = fetchedCohort.get();

    List<Learner> registeredLearners = cohort.getLearnerList();
    registeredLearners.add(fetchedLearner.get());

    cohort.setLearnerList(registeredLearners);
    return _cohortRepository.save(cohort);
  }

  public List<Cohort> fetchAllCohorts() {
    return _cohortRepository.findAll();
  }

  public Course createCourse(Course course) {
    return _courseRepository.save(course);
  }


  public Cohort assignAndCreateLearnersToCohort(List<Learner> learners, Long cohortId) {
    Cohort cohort = _cohortRepository.findById(cohortId)
        .orElseThrow(() -> new RuntimeException("Cohort not found with ID: " + cohortId));

    cohort.getLearnerList().addAll(learners);
    return _cohortRepository.save(cohort);
  }

  public PagedResponse<Cohort> getPaginatedCohorts(int pageSize, String sortBy, int pageNumber, Sort.Direction sortDir) {
    Sort sort = Sort.by(sortDir, sortBy);
    Pageable pageable = PageRequest.of(pageNumber, pageSize, sort);

    Page<Cohort> pagedCohort = _cohortRepository.findAll(pageable);

    return new PagedResponse<>(
        pagedCohort.getContent(),
        pagedCohort.getNumber(),
        pagedCohort.getSize(),
        pagedCohort.getTotalElements(),
        pagedCohort.getTotalPages(),
        pagedCohort.isFirst(),
        pagedCohort.isLast()
    );
  }
}

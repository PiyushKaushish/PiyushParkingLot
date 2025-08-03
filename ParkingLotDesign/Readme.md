Functional Requirements:

Parking Spot Allocation

Automatically assigns an available parking spot based on vehicle size:

Motorcycle → Small Spot

Car → Medium Spot

Bus → Large Spot

Check-In and Check-Out

Records entry time when a vehicle enters.

Records exit time and calculates total duration when the vehicle exits.

Parking Fee Calculation

Fee is calculated based on vehicle type and total parked time:

Motorcycle: ₹10/hour

Car: ₹20/hour

Bus: ₹30/hour

Duration is rounded up to the nearest hour.

Real-Time Availability Update

Updates parking spot availability immediately as vehicles enter and leave.

Prevents assignment of already-occupied spots.

Algorithm for Spot Allocation

Uses a simple greedy strategy:

Find the first available spot of required size across all levels and rows.

Assign it and mark it as occupied.

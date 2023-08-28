# landlordAPI
add .evn (to contain some dummy data)



ERD (Entity-Relationship Diagram) for landlord web app.
A textual representation of the relationships:


Add Images... these should be linked to a hostel. a one-to-many relationship (or one-to-one)

Hostel Entity:

Attributes: Hostel ID, Name, Services, Number of Rooms, Phone Number
Relationships:
Many-to-One with Location (Each hostel is located in one location, but
each location can have multiple hostels)
Many-to-One with Landlord (Each hostel is owned by one landlord, but
each landlord can own multiple hostels)
One-to-Many with Rooms (Each hostel has multiple rooms, but each
room is part of one hostel)


Landlord Entity:

Attributes: Landlord ID, Name, Contact Information
Relationships:
One-to-Many with Hostel (Each landlord can own multiple hostels,
but each hostel is owned by one landlord)


Rooms Entity:

Attributes: Room ID, Room Number, Room Type, Capacity
Relationships:
Many-to-One with Hostel (Each room belongs to one hostel,
but each hostel can have multiple rooms)


Location Entity:

Attributes: Location ID, Name, Country, City, Latitude, Longitude
Relationships:
One-to-Many with Hostel (Each location can have multiple hostels,
but each hostel is located in one location)


draw.io, Lucid-chart, or other ERD software to create the actual diagram.






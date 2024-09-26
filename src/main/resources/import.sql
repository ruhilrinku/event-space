-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

INSERT INTO event (id, name, description, type, summary, location, start_date, end_date, start_time, end_time, tenant_id, status, version)
VALUES ('4ba14de2-d0de-496d-b529-f4d04b917712','BCL Workshop - Zero to Hero','<p>Learn to create BCL components from scratch with experts.</p>','IN-PERSON','https://miro.medium.com/v2/resize:fit:720/format:webp/1*s4W2JRi95xGDK7gtufub4Q.png','BPTP Capital City, Noida','2024-09-25','2024-09-28','11:00:00','19:00:00','EVENTSPACE','CLOSED', 1),
('9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da','Quarkus Workshop','<p>Join the event to learn the basics of Quarkus.</p>','HYBRID','https://pbs.twimg.com/media/GOSD0U0WAAAiutu.jpg','Hilton Raleigh, North Hills','2024-09-24','2024-09-24','10:00:00','22:00:00','EVENTSPACE','PUBLISHED', 1);

INSERT INTO attendee (id, name, email, contact, area_of_interest, description, event_id, avatar, tenant_id, version)
VALUES ('0709f769-3617-4a6d-a6f5-242d412f5772', 'Himanshu Sahu', NULL, '', 'UI,Sales,Marketing', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', 'https://hackathon-bs.github.io/ES-Attendees/himanshu.jpg', 'EVENTSPACE', 1),
('18fcae3c-f796-41cf-b393-abc014751c63', 'Mohit Kumar', NULL, '', 'ML,Design,UI', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', 'https://hackathon-bs.github.io/ES-Attendees/mohit.png', 'EVENTSPACE', 1),
('e0cabe64-967e-4404-b83e-a1afd483779d', 'Himanshu Bhatnagar', NULL, '', 'UI,Sales,ML', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', 'https://hackathon-bs.github.io/ES-Attendees/hb.jpg', 'EVENTSPACE', 1),
('292d9234-b24a-4708-8aa6-f2d6a35383cf', 'Venkatesh Bishu', NULL, '', 'Marketing,UI,AI', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', 'https://hackathon-bs.github.io/ES-Attendees/venkatesh.png', 'EVENTSPACE', 1),
('0ce5a045-e685-4365-ac93-b28508b73ac7', 'Nishant kumar', NULL, '', 'Sales,Design,Marketing', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', 'https://hackathon-bs.github.io/ES-Attendees/nishant.png', 'EVENTSPACE', 1);

INSERT INTO session (id, session_type, title, event_day, start_time, description, speaker_id, duration, event_id, version)
VALUES ('aac38861-586c-4793-8bc5-0871a60f0f74', 'Registration', 'Registration', '2024-09-246', '10:30:00', '<p>Registration at Info Desk for the event.</p>', NULL, '{"hour": "1", "min": "0"}', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', 1),
('62eea645-88e2-4305-b7ee-00845a0489f6', 'Breakfast', 'Breakfast', '2024-09-24', '11:00:00', '<p>Have some amazing breakfast before diving deep into the sessions.</p>', '0ac53e96-4f26-413f-b5e5-f5c1b666fd79', '{"hour": "1", "min": "0"}', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', 1),
('0304602d-f066-4188-b1f5-664a8f835b6a', 'Keynote', 'Keynote', '2024-09-24', '17:00:00', '<p>Keynote by esteemed speakers</p>', 'f95ca6d3-53a1-4e2b-97ab-7339dcbbbfad', '{"hour": "1", "min": "0"}', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', 1);

INSERT INTO speaker (id, name, email, link, avatar, description, event_id, tenant_id, version)
VALUES ('0ac53e96-4f26-413f-b5e5-f5c1b666fd79', 'Himanshu Sahu', 'himanshu.sahu@brightlysoftware.com', 'https://hackathon-bs.github.io/ES-Attendees/himanshu.jpg', '', '<p>A renowned data scientist with numerous publications and awards.</p>', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 1),
('f95ca6d3-53a1-4e2b-97ab-7339dcbbbfad', 'Mohit Kumar', 'mohit.kumar@brightlysoftware.com', 'https://hackathon-bs.github.io/ES-Attendees/mohit.png', '', '<p>An expert in AI and machine learning, Mohit has over 20 years of experience.</p>', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 1);

INSERT INTO sponsor (id, name, category, website_link, logo, description, event_id, tenant_id, version)
VALUES ('977764df-9a9e-4bca-9316-e056f19fee5c', 'Brightly Platform', 'Platinum', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREHJTAAqrSjxIIxXfEjPloQ9YN3kgmpnd5UQ&s', NULL, '<p>Building Platform of the Future for Brightly.</p>', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 1),
('5fb94323-4f19-4904-a746-4c7200ff3a80', 'Event Manager', 'Gold', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREHJTAAqrSjxIIxXfEjPloQ9YN3kgmpnd5UQ&s', NULL, '<p>World-class enterprise event management software.</p>', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 1),
('5165dd01-37cf-4ef4-9428-7e71328df518', 'Carbon Analyser', 'Gold', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREHJTAAqrSjxIIxXfEjPloQ9YN3kgmpnd5UQ&s', NULL, '<p>World class tool for all your carbon footprints.</p>', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 1);

INSERT INTO ticket (id, name, description, price, event_id, tenant_id, status, version)
VALUES ('4add4481-f0cb-4622-9165-f7b1a9a35a17','Standard Ticket','<p>Access to all sessions, Lunch included, Networking opportunities</p>',49,'9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da',NULL,'open', 1),
('be902c71-6c12-4ab5-a8a2-45db94add40e','VIP Ticket','<p>All Standard benefits, Priority seating, Exclusive Swag Bag</p><p><br></p>',99,'9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da',NULL,'open', 1);


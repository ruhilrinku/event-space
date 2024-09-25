-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

INSERT INTO event (id, name, description, type, summary, location, start_date, end_date, start_time, end_time, tenant_id, status, version)
VALUES ('4ba14de2-d0de-496d-b529-f4d04b917712','BCL Workshop - Zero to Hero','<p>Learn to create BCL components from scratch with experts.</p>','IN-PERSON','https://miro.medium.com/v2/resize:fit:720/format:webp/1*s4W2JRi95xGDK7gtufub4Q.png','BPTP Capital City, Noida','2024-09-25','2024-09-28','11:00:00','19:00:00','EVENTSPACE','DRAFT', 1),
('9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da','Annual Business Conference','<p>Join the event to learn the basics of Business.</p>','HYBRID','https://hackathon-bs.github.io/ES-Attendees/EP_1.png','Hilton Raleigh, North Hills','2024-09-26','2024-09-28','10:00:00','22:00:00','EVENTSPACE','PUBLISHED', 1);

INSERT INTO attendee (id, name, email, contact, area_of_interest, description, event_id, avatar, tenant_id, version)
VALUES
('0709f769-3617-4a6d-a6f5-242d412f5772', 'Himanshu Sahu', NULL, '', 'UI,Sales,Marketing', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', 'https://media.licdn.com/dms/image/v2/D4D03AQE569KtuTCisA/profile-displayphoto-shrink_800_800/profile-displayphoto-shrink_800_800/0/1695025439986?e=1732752000&v=beta&t=ThfUereJriz41Ej9BezBeo2aj5G3ISzorxnCn_LaQmg', 'EVENTSPACE', 1),
('18fcae3c-f796-41cf-b393-abc014751c63', 'Himanshu Sahu', NULL, '', 'ML,Design,UI', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', 'https://media.licdn.com/dms/image/v2/D4D03AQE569KtuTCisA/profile-displayphoto-shrink_800_800/profile-displayphoto-shrink_800_800/0/1695025439986?e=1732752000&v=beta&t=ThfUereJriz41Ej9BezBeo2aj5G3ISzorxnCn_LaQmg', 'EVENTSPACE', 1),
('59f63447-396a-4e4e-b28f-ddee56b5ab4f', NULL, NULL, '', 'Design,ML,UI', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 'EVENTSPACE', 1),
('e0cabe64-967e-4404-b83e-a1afd483779d', 'Himanshu Sahu', NULL, '', 'UI,Sales,ML', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', 'https://media.licdn.com/dms/image/v2/D4D03AQE569KtuTCisA/profile-displayphoto-shrink_800_800/profile-displayphoto-shrink_800_800/0/1695025439986?e=1732752000&v=beta&t=ThfUereJriz41Ej9BezBeo2aj5G3ISzorxnCn_LaQmg', 'EVENTSPACE', 1),
('292d9234-b24a-4708-8aa6-f2d6a35383cf', 'Himanshu Sahu', NULL, '', 'Marketing,UI,AI', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', 'https://media.licdn.com/dms/image/v2/D4D03AQE569KtuTCisA/profile-displayphoto-shrink_800_800/profile-displayphoto-shrink_800_800/0/1695025439986?e=1732752000&v=beta&t=ThfUereJriz41Ej9BezBeo2aj5G3ISzorxnCn_LaQmg', 'EVENTSPACE', 1),
('0ce5a045-e685-4365-ac93-b28508b73ac7', 'Himanshu Sahu', 'Himanshu Sahu', '', 'Sales,Design,Marketing', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', 'https://media.licdn.com/dms/image/v2/D4D03AQE569KtuTCisA/profile-displayphoto-shrink_800_800/profile-displayphoto-shrink_800_800/0/1695025439986?e=1732752000&v=beta&t=ThfUereJriz41Ej9BezBeo2aj5G3ISzorxnCn_LaQmg', 'EVENTSPACE', 1),
('a3763723-4390-4ed7-85af-4dc1d73ac957', NULL, NULL, '', 'Design,AI,Marketing', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 'EVENTSPACE', 1),
('5d94660c-5b70-4b17-b786-aefb7b943347', NULL, NULL, '', 'UI,Marketing,AI', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 'EVENTSPACE', 1),
('13647f89-fa9c-48b3-9ad6-eb0cf31f3569', NULL, NULL, '', 'UI,Marketing,ML', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 'EVENTSPACE', 1),
('459e3333-2e7c-4a2c-8640-40b5772e3440', NULL, NULL, '', 'UI,Marketing,Sales', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 'EVENTSPACE', 1),
('96facbed-d586-4590-9dda-1eea8c4f2f92', NULL, NULL, '', 'UI,Marketing,Design', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 'EVENTSPACE', 1),
('d689c835-16a2-4c40-a203-18f03067b187', NULL, NULL, '', 'Marketing,Design,UI', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 'EVENTSPACE', 1),
('c33e4c28-2471-4e16-be9b-162eb841cc15', NULL, NULL, '', 'AI,UI,Marketing', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 'EVENTSPACE', 1),
('4a015c78-8d83-4d5e-bd09-fbeeaf47d203', NULL, NULL, '', 'Marketing,UI,Design', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 'EVENTSPACE', 1),
('c8bab7ab-75ee-4330-a51a-20aa0e7721e2', NULL, NULL, '', 'Sales,Marketing,UI', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 'EVENTSPACE', 1),
('711defbf-9cd8-4162-a2c8-5f39938c457e', NULL, NULL, '', 'ML,AI,Design', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 'EVENTSPACE', 1),
('bf6765e3-3efa-44d8-9728-652fa287b587', NULL, NULL, '', 'ML,AI,Design', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 'EVENTSPACE', 1),
('67492be7-9a78-473e-8be6-e9b65deeafb6', NULL, NULL, '', 'ML,UI,Marketing', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 'EVENTSPACE', 1),
('e15f3b7e-b4c5-4a41-89ea-847f7f7c1e4c', NULL, NULL, '', 'ML,UI,Marketing', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 'EVENTSPACE', 1),
('2c67f593-00b6-423b-85d0-c10c54e7b6a5', NULL, NULL, '', 'ML,AI,Design', '', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 'EVENTSPACE', 1);

INSERT INTO session (id, session_type, title, event_day, start_time, description, speaker_id, duration, event_id, version)
VALUES
('aac38861-586c-4793-8bc5-0871a60f0f74', 'Registration', 'Test title', '2024-09-26', '11:30:00', '<p>test description</p>', NULL, '{"hour": "1", "min": "0"}', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', 1),
('62eea645-88e2-4305-b7ee-00845a0489f6', 'Registration', 'Test2', '2024-09-27', '11:00:00', '<p>test</p>', '0ac53e96-4f26-413f-b5e5-f5c1b666fd79', '{"hour": "1", "min": "0"}', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', 1),
('0304602d-f066-4188-b1f5-664a8f835b6a', 'Keynote', 'Keynote', '2024-09-26', '17:00:00', '<p>Keynotes</p>', 'f95ca6d3-53a1-4e2b-97ab-7339dcbbbfad', '{"hour": "1", "min": "0"}', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', 1);

INSERT INTO speaker (id, name, email, link, avatar, description, event_id, tenant_id, version)
VALUES
('0ac53e96-4f26-413f-b5e5-f5c1b666fd79', 'Himanshu Sahu', 'himanshu.sahu@brightlysoftware.com', 'http://google.com', '', '<p>A renowned data scientist with numerous publications and awards.</p>', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 1),
('f95ca6d3-53a1-4e2b-97ab-7339dcbbbfad', 'Mohit Kumar', 'mohit.kumar@brightlysoftware.com', 'https://hackathon-bs.github.io/ES-Attendees/mohit.png', '', '<p>An expert in AI and machine learning, Mohit has over 20 years of experience.</p>', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 1);

INSERT INTO sponsor (id, name, category, website_link, logo, description, event_id, tenant_id, version)
VALUES
('977764df-9a9e-4bca-9316-e056f19fee5c', 'Brightly Platform', 'Platinum', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREHJTAAqrSjxIIxXfEjPloQ9YN3kgmpnd5UQ&s', NULL, '<p>Building Platform of the Future for Brightly.</p>', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 1),
('5fb94323-4f19-4904-a746-4c7200ff3a80', 'Event Manager', 'Gold', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREHJTAAqrSjxIIxXfEjPloQ9YN3kgmpnd5UQ&s', NULL, '<p>World-class enterprise event management software.</p>', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 1),
('5165dd01-37cf-4ef4-9428-7e71328df518', 'Carbon Analyser', 'Gold', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREHJTAAqrSjxIIxXfEjPloQ9YN3kgmpnd5UQ&s', NULL, '<p>World class tool to capture all your carbon footprints at one place.</p>', '9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da', NULL, 1);

INSERT INTO ticket (id, name, description, price, event_id, tenant_id, status, version)
VALUES
('4add4481-f0cb-4622-9165-f7b1a9a35a17','Standard Ticket','<p>Access to all sessions,Lunch included,Networking opportunities</p>',49,'9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da',NULL,'open', 1),
('be902c71-6c12-4ab5-a8a2-45db94add40e','VIP Ticket','<p>All Standard benefits,Priority seating,Exclusive Swag Bag</p><p><br></p>',99,'9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da',NULL,'open', 1),
('fae3b6f5-b155-486d-87d7-443928b19caa','Standard Ticket','<p>Access to all sessions, Lunch included, Networking opportunities</p>',49,'9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da','EVENTSPACE','open', 1),
('f587e49e-b382-45be-93e2-58ed0de6f267',NULL,NULL,NULL,'9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da',NULL,NULL, 1),
('f5ec51c9-a2ff-48e0-83d9-a6b26bb1c07f',NULL,NULL,NULL,'9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da',NULL,NULL, 1);

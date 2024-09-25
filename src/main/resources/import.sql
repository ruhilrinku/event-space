-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

INSERT INTO event (id, name, description, type, summary, location, start_date, end_date, start_time, end_time, tenant_id, status, version)
VALUES ('4ba14de2-d0de-496d-b529-f4d04b917712','BCL Workshop - Zero to Hero','<p>Learn to create BCL components from scratch with experts.</p>','IN-PERSON','https://miro.medium.com/v2/resize:fit:720/format:webp/1*s4W2JRi95xGDK7gtufub4Q.png','BPTP Capital City, Noida','2024-09-25','2024-09-28','11:00:00','19:00:00','EVENTSPACE','DRAFT', 1),
('9a5cdc56-6c5a-4716-8d0c-dc1a7f2fc3da','Annual Business Conference','<p>Join the event to learn the basics of Business.</p>','HYBRID','https://hackathon-bs.github.io/ES-Attendees/EP_1.png','Hilton Raleigh, North Hills','2024-09-26','2024-09-28','10:00:00','22:00:00','EVENTSPACE','PUBLISHED', 1);

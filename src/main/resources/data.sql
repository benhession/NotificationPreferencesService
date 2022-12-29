INSERT INTO Customer (email_address, phone_number, email_preference_flag, sms_preference_flag)
VALUES ('example@example.com', '07111111111', false, true);

INSERT INTO Notification (customer_id, status, status_description, sent_at)
VALUES (1, 'SUCCESS', 'Notification Received Successfully', CURRENT_TIMESTAMP);
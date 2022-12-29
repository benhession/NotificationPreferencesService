CREATE TABLE IF NOT EXISTS Customer (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    email_address VARCHAR(255) NOT NULL,
    phone_number VARCHAR(255) NOT NULL,
    email_preference_flag BOOLEAN NOT NULL,
    sms_preference_flag BOOLEAN NOT NULL,
    PRIMARY KEY (customer_id)
);

CREATE TABLE IF NOT EXISTS Notification (
    id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT NOT NULL,
    status VARCHAR(255) NOT NULL,
    status_description VARCHAR(500) NOT NULL,
    CONSTRAINT FK_Customer_Notification FOREIGN KEY (customer_id) REFERENCES Customer(customer_id)
);

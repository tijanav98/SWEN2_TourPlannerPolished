DROP TABLE IF EXISTS Tour;
DROP TABLE  IF EXISTS TourLogs;

CREATE TABLE Tour(
    tour_id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(500),
    start_location VARCHAR(255),
    end_location VARCHAR(255),
    transport_type VARCHAR(50),

    distance FLOAT,
    estimated_time TIME,
    route_info VARCHAR(500)
    );

CREATE TABLE TourLogs(
    log_id SERIAL PRIMARY KEY,
    tour_id INT NOT NULL,
    date_time TIMESTAMP NOT NULL,
    rating INT NOT NULL,
    comment VARCHAR(500),
    difficulty INT,
    total_time TIME,
    rating INT,
    FOREIGN KEY (tour_id) REFERENCES Tour(tour_id)

);
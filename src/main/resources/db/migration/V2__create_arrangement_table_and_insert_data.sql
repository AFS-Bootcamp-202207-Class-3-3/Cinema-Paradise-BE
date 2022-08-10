
create table if not exists arrangement (
  id     varchar(255) not null,
  room   varchar(255) not null,
  arrange_date  date,
  time  time not null,
  movie_id  varchar(255),
  cinema_id varchar(255) not null,
  price   double precision,
  CONSTRAINT pk_arrangement PRIMARY KEY (id)
);

INSERT INTO arrangement(
	id, room, arrange_date, "time", movie_id, cinema_id, price)
	VALUES ('11xx', 'A厅', '2022-08-09', '14:00:00', '1x', '11x', 35),
	('12xx', 'A厅', '2022-08-10', '10:00:00', '1x', '11x', 45),
	('13xx', 'A厅', '2022-08-10', '14:00:00', '1x', '11x', 65),
	('14xx', 'A厅', '2022-08-11', '14:00:00', '1x', '11x', 75),
	('15xx', 'A厅', '2022-08-11', '14:00:00', '1x', '11x', 85);


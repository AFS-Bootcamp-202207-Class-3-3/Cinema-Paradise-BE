
--create sequence employee_sequence start 1;

create table if not exists movie (
  id     varchar(255) not null,
  titlechinese   varchar(255) not null,
  titleenglish   varchar(255) not null,
  imageurl   varchar(255) not null,
  director   varchar(255),
  actors   varchar(255),
  types   varchar(255),
  releasedate   date,
  duration    int,
  introduction    varchar(255),
  rotationimageurl    varchar(255),
  score double precision
);
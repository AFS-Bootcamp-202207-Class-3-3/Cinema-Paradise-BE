
create table if not exists cinema (
  id     varchar(255) not null,
  name   varchar(255) not null,
  location   varchar(255) not null,
  CONSTRAINT pk_cinema PRIMARY KEY (id)
);

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
  score double precision,
  CONSTRAINT pk_movie PRIMARY KEY (id)
);

create table if not exists movie_orders (
  id     varchar(255) not null,
  user_id   varchar(255) not null,
  movie_id  varchar(255) not null,
  price   double precision,
  cinema_id varchar(255) not null,
  room varchar(255),
  order_date date,
  order_time time,
  seat varchar(255),
  paid boolean,
  CONSTRAINT pk_movie_orders PRIMARY KEY (id)
);
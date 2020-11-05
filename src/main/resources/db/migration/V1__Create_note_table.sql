create table NOTE (
    noteId bigint primary key auto_increment,
    name varchar(80) not null,
    critical bit,
    priority smallint,
    durationEstimated int unsigned,
    durationAverage int unsigned,
    durationReal int unsigned,
    memo varchar(120),
    label varchar(16),
    owner varchar(10),
    actTimeType varchar(20),
    date date
);
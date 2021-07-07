CREATE DATABASE prl;

CREATE TABLE public.students
(
    id character varying(36) NOT NULL,
    fullname character varying NOT NULL,
    employee_id character(36) varying NOT NULL,
    email character varying NOT NULL,
    active boolean NOT NULL,
    incorporated_date timestamp NOT NULL,
    department character varying(4) NOT NULL,
    position character varying NOT NULL,
    location character varying NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public.students
    OWNER to postgres;


CREATE TABLE public.courses
(
    id character varying(36) NOT NULL,
    name character varying NOT NULL,
    category character varying NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public.courses
    OWNER to postgres;

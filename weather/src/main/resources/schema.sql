create table postal_code (
                             id integer identity not null primary key,
                             value integer not null
);

create table county (
                        id integer identity not null primary key,
                        county_name text,
                        x numeric not null,
                        y numeric not null
);

create table city (
                      id integer identity not null primary key,
                      city_name text,
                      county_id integer not null,
                      foreign key (county_id) references county (id)
);

create table street (
                        id integer identity not null primary key,
                        street_name text,
                        postal_code_id integer not null,
                        foreign key (postal_code_id) references postal_code (id)
);


create table address (
                         id integer identity   not null PRIMARY KEY,
                         house_number integer not null,
                         city_id integer not null,
                         foreign key (city_id) references city (id),
                         street_id integer not null,
                         foreign key (street_id) references street(id)

);

create table recycle_bin (
                             id integer identity not null primary key,
                             recycle_bin_name text
);


create table address_recycle_bin (
                                     id integer identity  not null primary key,
                                     address_id integer not null,
                                     recycle_bin_id integer not null,
                                     foreign key (address_id) references address (id),
                                     foreign key (recycle_bin_id) references recycle_bin (id)
);

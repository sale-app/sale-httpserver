insert into CITY (city_name) values("Gurgaon");
insert into CITY (city_name) values("Delhi");
insert into CITY (city_name) values("Noida");

insert into AREA (area_name) values("Sector 49");
insert into AREA (area_name) values("Sector 18");
insert into AREA (area_name) values("Sector 31");
insert into AREA (area_name) values("Sector 38A");
insert into AREA (area_name) values("Sector 30");
insert into AREA (area_name) values("Laxminagar");

insert into MALL (MALL_NAME, LATITUDE, LONGITUDE) values ("Omaxe City Center",29.05877570,76.08560100);
insert into MALL (MALL_NAME, LATITUDE, LONGITUDE) values ("The Great India Place",28.56756230,77.32569070);
insert into MALL (MALL_NAME, LATITUDE, LONGITUDE) values ("DT Star Mall",28.4632450,77.0578855);
insert into MALL (MALL_NAME, LATITUDE, LONGITUDE) values ("V3S Mall",28.63530800,77.22496000);

insert into CITY_AREA_MAPPING (city_id, area_id) values (1,1);
insert into CITY_AREA_MAPPING (city_id, area_id) values (1,3);
insert into CITY_AREA_MAPPING (city_id, area_id) values (3,2);
insert into CITY_AREA_MAPPING (city_id, area_id) values (3,4);
insert into CITY_AREA_MAPPING (city_id, area_id) values (1,5);
insert into CITY_AREA_MAPPING (city_id, area_id) values (2,6);

insert into MALL_LOCATION_MAPPING (city_id, area_id, mall_id) values (3,4,2);
insert into MALL_LOCATION_MAPPING (city_id, area_id, mall_id) values (1,1,1);
insert into MALL_LOCATION_MAPPING (city_id, area_id, mall_id) values (1,5,3);
insert into MALL_LOCATION_MAPPING (city_id, area_id, mall_id) values (2,6,4);

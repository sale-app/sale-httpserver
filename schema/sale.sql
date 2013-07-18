CREATE TABLE Area
  (
    area_id   INTEGER NOT NULL ,
    area_name VARCHAR (128) NOT NULL
  ) ;
ALTER TABLE Area ADD CONSTRAINT Area_PK PRIMARY KEY
(
  area_id
)
;

CREATE TABLE City
  (
    city_id   INTEGER NOT NULL ,
    city_name VARCHAR (128) NOT NULL
  ) ;
ALTER TABLE City ADD CONSTRAINT City_PK PRIMARY KEY
(
  city_id
)
;

CREATE TABLE area_mall_mapping
  (
    area_id INTEGER NOT NULL ,
    mall_id INTEGER NOT NULL
  ) ;
ALTER TABLE area_mall_mapping ADD CONSTRAINT area_mall_mapping_PK PRIMARY KEY
(
  area_id, mall_id
)
;

CREATE TABLE area_store_mapping
  (
    area_id  INTEGER NOT NULL ,
    store_id INTEGER NOT NULL
  ) ;
ALTER TABLE area_store_mapping ADD CONSTRAINT area_store_mapping_PK PRIMARY KEY
(
  area_id, store_id
)
;

CREATE TABLE category
  (
    category_id        INTEGER NOT NULL ,
    category_name      VARCHAR2 (128 CHAR) NOT NULL ,
    parent_category_id INTEGER NOT NULL
  ) ;
ALTER TABLE category ADD CONSTRAINT category_PK PRIMARY KEY
(
  category_id
)
;

CREATE TABLE city_area_mapping
  (
    city_id INTEGER NOT NULL ,
    area_id INTEGER NOT NULL
  ) ;
ALTER TABLE city_area_mapping ADD CONSTRAINT pk_city_area_mapping PRIMARY KEY
(
  city_id, area_id
)
;

CREATE TABLE mall
  (
    mall_id   INTEGER NOT NULL ,
    mall_name VARCHAR2 (128 CHAR) NOT NULL ,
    latitude  NUMBER (5,1) NOT NULL ,
    longitude NUMBER (5,1) NOT NULL
  ) ;
ALTER TABLE mall ADD CONSTRAINT mall_PK PRIMARY KEY
(
  mall_id
)
;

CREATE TABLE mall_store_mapping
  (
    mall_id  INTEGER NOT NULL ,
    store_id INTEGER NOT NULL
  ) ;
ALTER TABLE mall_store_mapping ADD CONSTRAINT mall_store_mapping_PK PRIMARY KEY
(
  mall_id, store_id
)
;

CREATE TABLE product
  (
    product_id   INTEGER NOT NULL ,
    product_name VARCHAR2 (128 CHAR) NOT NULL
  ) ;
ALTER TABLE product ADD CONSTRAINT product_PK PRIMARY KEY
(
  product_id
)
;

CREATE TABLE product_category_mapping
  (
    product_id  INTEGER NOT NULL ,
    category_id INTEGER NOT NULL
  ) ;
ALTER TABLE product_category_mapping ADD CONSTRAINT product_category_mapping_PK PRIMARY KEY
(
  product_id, category_id
)
;

CREATE TABLE sale
  (
    sale_id    INTEGER NOT NULL ,
    store_id   INTEGER NOT NULL ,
    product_id INTEGER NOT NULL ,
    offer NVARCHAR2 (1024) NOT NULL ,
    start_date DATE ,
    end_date   DATE
  ) ;
ALTER TABLE sale ADD CONSTRAINT sale_PK PRIMARY KEY
(
  sale_id
)
;

CREATE TABLE store
  (
    store_id     INTEGER NOT NULL ,
    store_name   VARCHAR2 (128 CHAR) NOT NULL ,
    address      VARCHAR2 (256 CHAR) NOT NULL ,
    phone_number VARCHAR2 (128 CHAR) NOT NULL ,
    latitude     NUMBER (5,1) NOT NULL ,
    longitude    NUMBER (5,1) NOT NULL
  ) ;
ALTER TABLE store ADD CONSTRAINT store_PK PRIMARY KEY
(
  store_id
)
;

CREATE TABLE store_product_mapping
  (
    store_id   INTEGER NOT NULL ,
    product_id INTEGER NOT NULL
  ) ;
ALTER TABLE store_product_mapping ADD CONSTRAINT store_product_mapping_PK PRIMARY KEY
(
  store_id, product_id
)
;

ALTER TABLE area_mall_mapping ADD CONSTRAINT amm_area_fk FOREIGN KEY ( area_id ) REFERENCES Area ( area_id ) ;

ALTER TABLE area_mall_mapping ADD CONSTRAINT amm_mall_fk FOREIGN KEY ( mall_id ) REFERENCES mall ( mall_id ) ;

ALTER TABLE area_store_mapping ADD CONSTRAINT asm_area_fk FOREIGN KEY ( area_id ) REFERENCES Area ( area_id ) ;

ALTER TABLE area_store_mapping ADD CONSTRAINT asm_store_fk FOREIGN KEY ( store_id ) REFERENCES store ( store_id ) ;

ALTER TABLE category ADD CONSTRAINT category_parent_category_FK FOREIGN KEY ( parent_category_id ) REFERENCES category ( category_id ) ;

ALTER TABLE city_area_mapping ADD CONSTRAINT city_area_mapping_Area_FK FOREIGN KEY ( area_id ) REFERENCES Area ( area_id ) ;

ALTER TABLE city_area_mapping ADD CONSTRAINT city_area_mapping_City_FK FOREIGN KEY ( city_id ) REFERENCES City ( city_id ) ;

ALTER TABLE mall_store_mapping ADD CONSTRAINT msm_mall_fk FOREIGN KEY ( mall_id ) REFERENCES mall ( mall_id ) ;

ALTER TABLE mall_store_mapping ADD CONSTRAINT msm_store_fk FOREIGN KEY ( store_id ) REFERENCES store ( store_id ) ;

ALTER TABLE product_category_mapping ADD CONSTRAINT pcm_category_fk FOREIGN KEY ( category_id ) REFERENCES category ( category_id ) ;

ALTER TABLE product_category_mapping ADD CONSTRAINT pcm_product_fk FOREIGN KEY ( product_id ) REFERENCES product ( product_id ) ;

ALTER TABLE sale ADD CONSTRAINT sale_product_FK FOREIGN KEY ( product_id ) REFERENCES product ( product_id ) ;

ALTER TABLE sale ADD CONSTRAINT sale_store_FK FOREIGN KEY ( store_id ) REFERENCES store ( store_id ) ;

ALTER TABLE store_product_mapping ADD CONSTRAINT spm_product_fk FOREIGN KEY ( product_id ) REFERENCES product ( product_id ) ;

ALTER TABLE store_product_mapping ADD CONSTRAINT spm_store_fk FOREIGN KEY ( store_id ) REFERENCES store ( store_id ) ;

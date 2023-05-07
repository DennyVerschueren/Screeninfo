INSERT INTO END_USER
(ID, email_address, username, password, role, get_updates)
VALUES
    (nextval('USER_SEQ'), 'mechelenfeestapp@gmail.com', 'admin', '$2a$10$qkYEzClRvGL03mzmKI1Tw.WGRKzm19S5aqQUeFb7x5/pGw/bhq96K', 'ROLE_ADMIN', FALSE);

INSERT INTO END_USER
(ID, email_address, username, password, role, get_updates)
VALUES
    (nextval('USER_SEQ'), 'mechelenfeestapp@gmail.com', 'testuser', '$2a$10$qkYEzClRvGL03mzmKI1Tw.WGRKzm19S5aqQUeFb7x5/pGw/bhq96K', 'ROLE_USER', FALSE);

insert into SPOT(
    ID,SPOT_TYPE,MAP_CORDINATX,MAP_CORDINATY,SPOT_NAME,SHORT_INFO,ADRESS)
VALUES (
           1,'TOILET',50,50,'cafeToilet','je moet wel iets kopen','mechelenStraat 84');

insert into SPOT(
    ID,SPOT_TYPE,MAP_CORDINATX,MAP_CORDINATY,SPOT_NAME,SHORT_INFO,ADRESS,START_DATE,EXTRA_LINK)
VALUES (
           2,'FESTIVAL',176,256,'de Koer','DE KOER zal dit jaar niet meer op Maanrock staan, maar krijgt zijn eigen festival','Cultuurplein Mechelen','2023-04-04','https://www.dezomerisvanmechelen.be/evenement/de-koer/info');

insert into SPOT(
    ID,SPOT_TYPE,MAP_CORDINATX,MAP_CORDINATY,SPOT_NAME,SHORT_INFO,ADRESS)
VALUES (
           3,'TOILET',75,90,'wc kot','een publiek toilet','NekerpoelPlein');

insert into SPOT(
    ID,SPOT_TYPE,MAP_CORDINATX,MAP_CORDINATY,SPOT_NAME,SHORT_INFO,ADRESS)
VALUES (
           4,'VOEDSELKRAAM',35,180,'HotDog Jho','een klein kraampje','KappersLaan');



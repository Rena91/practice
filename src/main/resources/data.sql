
INSERT INTO BUS_DEPOT(DEPOTID, DEPOTNAME, DEPOTBUSES, BUSUPDATED)
VALUES
       (001, 'AFJALGUNJ', 0, CURRENT_DATE()),
       (002, 'CONTONMENT', 0, CURRENT_DATE()),
       (003, 'KUKATPALLY', 0, CURRENT_DATE()),
       (004, 'MUSHEERABD', 0, CURRENT_DATE()),
       (005, 'MEHDIPATNAM', 0, CURRENT_DATE());

INSERT INTO BUSES(BUSID, BUSNAME, BUSNUMBER, BUSTYPE, BUSCLASS, BUSSERVICESTARTED,DEPOTID)
VALUES
(2001, 'VOLVO Multi Axle', 'TS09Z9991', 'AC-Sleeper', 'premium', CURRENT_DATE(),001),
(2002, 'VOLVO SingleAxle', 'TS09Z9992', 'AC-Sleeper', 'premium', CURRENT_DATE(),002),
(2003, 'ISUZU Multi Axle', 'TS09Z9993', 'AC-Seater', 'premium', CURRENT_DATE(),004),
(2004, 'ISUZU Single Axle', 'TS09Z9994', 'AC-Sleeper', 'premium', CURRENT_DATE(),005),
(2005, 'Ashok Leyaland Single Axle', 'TS09Z9995', 'Non-AC-Seater', 'Delux', CURRENT_DATE(),005),
(2006, 'TATA Single Axle', 'TS09Z9996', 'Non-AC-Seater','Luxury', CURRENT_DATE(),001),
(2007, 'TATA Single Axle', 'TS09Z9997', 'AC-Seater','Luxury', CURRENT_DATE(),003),
(2008, 'ISUZU Single Axle', 'TS09Z9998', 'Non-AC-Seater', 'premium', CURRENT_DATE(),002),
(2009, 'VOLVO SingleAxle', 'TS09Z9999', 'AC-Seater', 'premium', CURRENT_DATE(),001);


--
--

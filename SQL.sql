CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombreUsuario` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `usuario` VALUES (1,'fabian','123'),(2,'pepe','456'),(3,'cristina','789');


-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema vedom
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema vedom
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `vedom` DEFAULT CHARACTER SET utf8 ;
USE `vedom` ;

-- -----------------------------------------------------
-- Table `vedom`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vedom`.`products` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `price` DOUBLE NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `vedom`.`roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vedom`.`roles` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `role` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `vedom`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vedom`.`users` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `role_role_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_user_role_idx` (`role_role_id` ASC),
  CONSTRAINT `fk_user_role`
    FOREIGN KEY (`role_role_id`)
    REFERENCES `vedom`.`roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `vedom`.`orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vedom`.`orders` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_user_id` INT(11) NOT NULL,
  `product_product_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_order_user1_idx` (`user_user_id` ASC),
  INDEX `fk_order_product1_idx` (`product_product_id` ASC),
  CONSTRAINT `fk_order_product1`
    FOREIGN KEY (`product_product_id`)
    REFERENCES `vedom`.`products` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_order_user1`
    FOREIGN KEY (`user_user_id`)
    REFERENCES `vedom`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

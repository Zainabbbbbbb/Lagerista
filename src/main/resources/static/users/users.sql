#
# Created: 2022-12-10
# Author: Rudolf Radlbauer
#

# database script for adding some data to user table
# initial passwords are equal to user names

using medpx;

INSERT INTO `roles` (`name`, `description`) VALUES
    ('ADMIN', 'admin users'),
    ('DOCTOR', 'doctors');


INSERT INTO `users` (`name`, `password`) VALUES
    ('admin', '$2a$10$Cn67SB3dU/CuPnelYue8I.t8liPV0Bl/E8dfCAHPeblcrer24P8P2'),
    ('both', '$2a$10$8veS.ZPOWzM0MUq0J3D/uutzNF.mV/gE21voAD1XHnVsryk0jV2re'),
    ('doctor', '$2a$10$hXh3lL9VPGvDp5rSgs0axuvXBW8julVHD2/KsH144LbScuvJc9/hu');


INSERT INTO `users_roles` (`med_user_name`, `roles_name`) VALUES
    ('admin', 'ADMIN'),
    ('both', 'ADMIN'),
    ('both', 'DOCTOR'),
    ('doctor', 'DOCTOR');


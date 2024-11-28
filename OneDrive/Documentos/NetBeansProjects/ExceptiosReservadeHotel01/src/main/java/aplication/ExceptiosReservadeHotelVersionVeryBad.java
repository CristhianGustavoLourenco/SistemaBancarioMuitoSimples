/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package aplication;

import entities.ReservationVersionVeryBad;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ExceptiosReservadeHotelVersionVeryBad {

    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = scan.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(scan.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(scan.next());

        if (!checkOut.after(checkIn)) {
            System.out.print("Error in reservation: Check-out date must be after check-in date");

        } else {
            
            ReservationVersionVeryBad reservation = new ReservationVersionVeryBad(number, checkIn, checkOut);
            System.out.println("Reservation" + reservation);

            System.out.print("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(scan.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(scan.next());

            Date now = new Date();

            if (checkIn.before(now) || checkOut.before(now)) {
                System.out.print("Error in reservation: Reservation dates for update must be future");
            } else if (!checkOut.after(checkIn)) {
                System.out.print("Error in reservation: Check-out date must be after check-in date");
            }else{
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation" + reservation);
            }
        }

    }
}

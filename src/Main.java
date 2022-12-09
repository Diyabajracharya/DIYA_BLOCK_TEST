import Model.Items;
import Model.Orders;
import Model.Users;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {

                //Items List
                ArrayList<model.Items> joshItems = new ArrayList<model.Items>();
                model.Items i1 = new model.Items("Skrit", 0001, "Zara", 2500, "Zara Store");
                joshItems.add(i1);
                model.Items i2 = new model.Items("t-shirt", 0002, "Essentials",2000, "Base Mark");
                ArrayList<model.Items> dennyItems = new ArrayList<model.Items>();
                dennyItems.add(i2);
                ArrayList<model.Items> yackItems = new ArrayList<model.Items>();
                model.Items i3 = new model.Items("jacket", 0003, "Good American", 5000, "Forever 21");
                yackItems.add(i3);
                ArrayList<model.Items> benItems = new ArrayList<model.Items>();
                model.Items i4 = new model.Items("pant", 0004, "Good American", 2000, "Sassy Lassy");
                benItems.add(i4);
                ArrayList<model.Items> ChaapeItems = new ArrayList<model.Items>();
                model.Items i5 = new model.Items("blazer", 0005, "Salt", 9000, "Anything");
                ChaapeItems.add(i5);

                //Orders List
                ArrayList<Orders> joshsOrder = new ArrayList<Orders>();
                Orders o1 = new Orders(joshItems, "Rs 6000", 1, "smth1", "STORE1", 1110);
                joshsOrder.add(o1);
                ArrayList<Orders> dennyOrder = new ArrayList<Orders>();
                Orders o2 = new Orders(dennyItems, "Rs 7000", 2,"Smth2", "STORE2", 1111);
                dennyOrder.add(o2);
                ArrayList<Orders> benOrder = new ArrayList<Orders>();
                Orders o3 = new Orders(dennyItems, "Rs 8000", 2,"Smth3", "STORE3", 1112);
                dennyOrder.add(o3);
                ArrayList<Orders> ChaapesOrder = new ArrayList<Orders>();
                Orders o4 = new Orders(dennyItems, "Rs 9000", 2,"Smth4", "STORE4", 1113);
                dennyOrder.add(o4);



                //Users List
                Users u1 = new Users(joshsOrder, 1, "josh", "PINK", "skirt", 91);
                Users u2 = new Users(dennyOrder,2, "denny", "DARK PINK", "hoodie", 81);
                Users u3 = new Users(dennyOrder,2, "yack", "DARK PINK", "hoodie", 81);
                Users u4 = new Users(dennyOrder,2, "ben", "DARK PINK", "hoodie", 81);

                i1.getItem();
                i2.getItem();
                i3.getItem();
                i4.getItem();
                i5.getItem();
        }
}
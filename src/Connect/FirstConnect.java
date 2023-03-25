package Connect;

import org.json.JSONArray;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import org.json.JSONObject;
public class FirstConnect {
    public static void main(String[] args) throws IOException {
        ConnectURI koneksisaya = new ConnectURI();
        URL myAddress = koneksisaya.buildURL
                ("https://farmasi.mimoapps.xyz/mimoqss2auyqD1EAlkgZCOhiffSsFl6QqAEIGtM");
        String response = koneksisaya.getResponseFromHttpUrl(myAddress);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan harga yang ingin dicari");
        String searching = scanner.nextLine();

        assert response != null;

        JSONArray responseJSON = new JSONArray(response);
        ArrayList<ResponseModel> ResponseModel = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < responseJSON.length(); i++) {
            ResponseModel resModel = new ResponseModel();
            JSONObject myJSONObject = responseJSON.getJSONObject(i);
            String price = myJSONObject.getString("i_sell");
            resModel.setI_sell(price);
            ResponseModel.add(resModel);

            int priceInt = Integer.parseInt(price);
            if (priceInt <= 2000) {
                count++;
            }
        }

        for (int index = 0; index < ResponseModel.size(); index++) {
            int price = Integer.parseInt(ResponseModel.get(index).getI_sell());
            if (price <= 2000) {
                System.out.println("price = " + price);
            }
        }
        System.out.println("Jumlah yang mempunyai harga ");
    }
}
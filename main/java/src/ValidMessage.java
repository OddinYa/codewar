

public class ValidMessage {

    static boolean result = false;

    public static boolean isAValidMessage(String message) {


        int idx = 1;
        try {
            if (message.length() == 0) {
                result = true;
                return result;
            }


            while (true) {
                try {

                    int x = Integer.parseInt(message.substring(0, idx));
                    idx++;
                } catch (Exception e) {

                    break;
                }
            }
            idx--;
            int numb = Integer.parseInt(message.substring(0, idx));

            isAValidMessage(message.substring(numb + idx));

        } catch (Exception e) {
            result = false;
            return result;
        }

        return result;
    }

}

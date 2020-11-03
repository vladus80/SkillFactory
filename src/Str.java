public class Str {


        public static void main(String[] args) {

            String[] arr = {"34", "434", "35", "323", "24"};
            StringBuilder stringBuilder = new StringBuilder();

            System.out.println(printStringBuilder(arr,stringBuilder));
        }



        private static String printStringBuilder(String[] arrStr, StringBuilder stringBuilder){

            for (String val:arrStr ) {

                stringBuilder.append(val+",");

            }
            stringBuilder.delete(stringBuilder.length()-1, stringBuilder.length());
            return  stringBuilder.toString();

        }

}

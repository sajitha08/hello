public class Day14_Factory {
    interface Notification{
        void send (String to , String message);
    }
    class TextNotification implements Notification{
        @Override

            public void send (String to , String message){
                System.out.println("Sending Text : " +message );
            System.out.println("to : " + to);
            }

    }
        class AudioNotification implements Notification{
            @Override
            public void send(String to, String message) {
                    System.out.println("Sending Audio : " +message);
                    System.out.println(" , to" + to);
                }
            }
            static Notification
        getNotification(Day14_Factory factory,String type){
                return switch (type){
                    case "Text"-> factory.new TextNotification();
                    case "Audio"-> factory.new AudioNotification();
                    default -> throw new IllegalArgumentException("Invalid notification type: "+type);
                };
            }
            static void main() {
                Day14_Factory factory = new Day14_Factory();

                String type = "Text";
                getNotification(factory, type).send("789456123" , "new text");
            }
        }

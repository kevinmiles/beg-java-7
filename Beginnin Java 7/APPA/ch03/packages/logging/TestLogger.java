import logging.Logger;
import logging.LoggerFactory;

class TestLogger
{
   public static void main(String[] args)
   {
      Logger logger = LoggerFactory.newLogger(LoggerFactory.NULLDEVICE);
      if (logger.connect())
      {
         logger.log("test message #1");
         logger.disconnect();
      }
   }
}

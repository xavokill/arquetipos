package mx.com.backend.asesores.commons;

import java.util.ResourceBundle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Class Messages.
 */
public class Messages {

  /**
   * Instantiates a new messages.
   */
  private Messages() {

  }

  /** The Constant LOG. */
  private static final Logger LOG = LogManager.getLogger(Messages.class);

  /** The Constant resourceBundle. */
  private static final ResourceBundle resourceBundle = 
      ResourceBundle.getBundle("business-exception");

  /** The Constant BASE_ERROR_PROPERTY. */
  private static final String BASE_ERROR_PROPERTY = "messages.Asesores.%s";

  /**
   * Gets the message.
   *
   * @param code the code
   * @return the message
   */
  public static String getMessage(int code) {
    String key = String.format(BASE_ERROR_PROPERTY, code);
    String mensajeError = null;
    try {
      mensajeError = resourceBundle.getString(key);
      LOG.debug(" Exception  code: {} mensaje: {}", code, mensajeError);
    } catch (Exception e) {
      LOG.error(": No se encontro mensaje de error {}", key, e);
      mensajeError = "";
    }

    return mensajeError;
  }
}

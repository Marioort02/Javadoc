import java.util.HashMap;
import java.util.Map;

public class AI {

    /**
     * Representa un asistente de inteligencia artificial capaz de responder preguntas
     * y aprender nuevas respuestas.
     *
     * @author ChatGPT
     * @version 1.2
     * @since 2025-02-23
     */
    public class AIAssistant {
        private KnowledgeBase knowledgeBase;

        /**
         * Constructor que inicializa la base de conocimientos.
         */
        public AIAssistant() {
            this.knowledgeBase = new KnowledgeBase();
        }

        /**
         * Responde a una pregunta basada en la base de conocimientos.
         *
         * @param question La pregunta que se hace al asistente.
         * @return La respuesta si está en la base de conocimientos, de lo contrario un mensaje indicando que no sabe.
         */
        public String answerQuestion(String question) {
            return knowledgeBase.getAnswer(question);
        }

        /**
         * Permite al asistente aprender una nueva respuesta.
         *
         * @param question La pregunta que se desea agregar a la base de conocimientos.
         * @param answer La respuesta correspondiente a la pregunta.
         */
        public void learnResponse(String question, String answer) {
            knowledgeBase.addKnowledge(question, answer);
        }
    }

    /**
     * Representa una base de conocimientos para almacenar preguntas y respuestas.
     *
     * @author ChatGPT
     * @version 1.0
     * @since 2025-02-23
     */
    class KnowledgeBase {
        private Map<String, String> knowledge;

        /**
         * Constructor que inicializa la base de conocimientos como un HashMap vacío.
         */
        public KnowledgeBase() {
            this.knowledge = new HashMap<>();
        }

        /**
         * Obtiene la respuesta a una pregunta.
         *
         * @param question La pregunta a consultar.
         * @return La respuesta correspondiente o un mensaje predeterminado si no existe.
         */
        public String getAnswer(String question) {
            return knowledge.getOrDefault(question, "No tengo una respuesta para esa pregunta.");
        }

        /**
         * Agrega una nueva pregunta y su respuesta a la base de conocimientos.
         *
         * @param question La pregunta a agregar.
         * @param answer La respuesta asociada a la pregunta.
         */
        public void addKnowledge(String question, String answer) {
            knowledge.put(question, answer);
        }
    }

}

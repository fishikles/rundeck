package rundeck

import com.fasterxml.jackson.core.JsonParseException
import com.fasterxml.jackson.databind.ObjectMapper

class ScheduledExecutionStats {

    String content

    static belongsTo=[se:ScheduledExecution]
    static transients = ['contentMap']

    static mapping = {
        content type: 'text'
    }

    public Map getContentMap() {
        if (null != content) {
            final ObjectMapper objMapper = new ObjectMapper()
            try{
                return objMapper.readValue(content, Map.class)
            }catch (JsonParseException e){
                return null
            }
        } else {
            return null
        }

    }


    public void setContentMap(Map obj) {
        if (null != obj) {
            final ObjectMapper objMapper = new ObjectMapper()
            content = objMapper.writeValueAsString(obj)
        } else {
            content = null
        }
    }

}

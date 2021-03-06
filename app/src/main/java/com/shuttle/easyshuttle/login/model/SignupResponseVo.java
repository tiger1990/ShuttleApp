package com.shuttle.easyshuttle.login.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

/**
 * Created by Deepak Pawar on 1/26/2016.
 */
public class SignupResponseVo extends BaseLoginSignupVo implements JsonDeserializer<SignupResponseVo>
{

    public boolean isValidJson()
    {
        return isValidJson;
    }

    @Override
    public SignupResponseVo deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
    {
        if (json.isJsonObject())
        {
            isValidJson = true;
            JsonObject loginJsonObject = json.getAsJsonObject();
            parseCommonResponse(loginJsonObject);
            userId = getStringValueFromKey(loginJsonObject, "userId");
        }
        else
        {
            isValidJson = false;
        }
        return this;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getMobile()
    {
        return mobile;
    }

    public String getNewUser()
    {
        return newUser;
    }

    public String getPassword()
    {
        return password;
    }

    public String getActive()
    {
        return active;
    }

    public String getUserId()
    {
        return userId;
    }

    public String getUserType()
    {
        return userType;
    }

    public String getValidLogin()
    {
        return validLogin;
    }

    public String getAccountActive()
    {
        return accountActive;
    }

    public String getLastName()
    {
        return lastName;
    }

}

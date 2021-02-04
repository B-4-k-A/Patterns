package structural.flyweight;

import java.util.HashMap;

public class TextureFactory {
    private HashMap<String, Texture> textures = new HashMap<>();

    public Texture getTexture(String textureName) {
        Texture texture = textures.get(textureName);
       if(texture == null) {
           switch(textureName) {
               case "apple":
                   texture = new Texture(/*apple*/);
                   textures.put("apple", texture);
               case "orange":
                   texture = new Texture(/*orange*/);
                   textures.put("orange", texture);
               case "apricot":
                   texture = new Texture(/*apricot*/);
                   textures.put("apricot", texture);
           }
       }
       return texture;
    }
}

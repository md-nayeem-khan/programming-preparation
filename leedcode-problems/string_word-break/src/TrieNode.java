import java.util.HashMap;
import java.util.Map;

class TrieNode {
    boolean isWord;
    Map<Character, TrieNode> children;

    TrieNode() {
        this.children = new HashMap<>();
    }
}
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Intent intent = new Intent();
    intent.setComponent(new ComponentName(
        "com.Shimofumi_ya.mumasekai",
        "com.unity3d.player.UnityPlayerActivity"
    ));
    startActivity(intent);
    finish(); // optional: close launcher after launching the game
}

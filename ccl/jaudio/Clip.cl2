#include ccl/jaudio/Audio.cl2

{
    var Clip = {|AudioStream, AudioPlayer, source|
        var stream = AudioStream(source);
        var player = AudioPlayer.player;
        
        return [
            stream:stream,
            player:player,
            start:{|| player.start(stream);},
            stop:{|| player.stop(stream);}
        ];
    }
    
    Audio.push(Clip.bind(
        java("sun.audio.AudioStream"), java("sun.audio.AudioPlayer")
    ), "Clip");
}
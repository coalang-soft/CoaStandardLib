#include ccl/jaudio/Audio.cl2

{
    var MidiSys = java("javax.sound.midi.MidiSystem");
    var Synth = {|Midi|
        var synth = Midi.getSynthesizer();
        synth.open();
        
        var channels = array(synth.getChannels());
        channels.push(synth, "native");
        
        return channels;
    }
    
    Audio.push([
        Synthesizer: Synth.bind(MidiSys),
        STDPIANO: 0,
        STDDRUM: 9
    ], "Midi");
}
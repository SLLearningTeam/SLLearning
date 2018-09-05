import Sound from 'react-native-sound';
import good from './sou/good'
let demoAudio = require('good');//支持众多格式
const s = new Sound(demoAudio, (e) => {
                if (e) {
                     console.log('播放失败');
                    return;
                }
                s.play(() => s.release());
            });

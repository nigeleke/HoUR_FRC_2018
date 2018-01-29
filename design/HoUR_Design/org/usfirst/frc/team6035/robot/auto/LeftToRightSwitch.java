package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.Config;

public class LeftToRightSwitch extends AutoDirection{

	public LeftToRightSwitch() {
		super(Config.LEFT_TO_RIGHT_SWITCH_SPEED_COMPENSATION);	
	}

	private double[] leftMotorSpeeds = {
			0.0, 
			0.14645154930206666, 
			0.228327413069198, 
			0.27464443723647425, 
			0.3008431961628721, 
			0.31565962650338514, 
			0.3240348949080433, 
			0.3287658022598304, 
			0.33143279504657525, 
			0.33293282257034407, 
			0.33377023323334865, 
			0.3342351673524932, 
			0.33448481922317996, 
			0.33461229676507775, 
			0.33466442599745977, 
			0.33467239820708006, 
			0.3346473239876923, 
			0.33460275189270294, 
			0.3345376318849292, 
			0.3344643063155799, 
			0.334376078302844, 
			0.3342903001886616, 
			0.3341867990437354, 
			0.33407219275160943, 
			0.3339254427018226, 
			0.3337544742455961, 
			0.3335365247370789, 
			0.3332888703357103, 
			0.33298528026631036, 
			0.3326643349032562, 
			0.33229154425077534, 
			0.3319346702671353, 
			0.3315084016120376, 
			0.3310388019169598, 
			0.33043851685739595, 
			0.3297397710403125, 
			0.328848649732418, 
			0.327836426103554, 
			0.32659524784929667, 
			0.32528581030653425, 
			0.32376671572384447, 
			0.32232302693642156, 
			0.32059994090968014, 
			0.3187071566800171, 
			0.3162808381460275, 
			0.3134565420927964, 
			0.30984443283317703, 
			0.3057506099833693, 
			0.3007332549263898, 
			0.2955058651258699, 
			0.28950205106023114, 
			0.2840398275602392, 
			0.2776049083531932, 
			0.27073175520790377, 
			0.26190311380776354, 
			0.25180682746204097, 
			0.23893679106993146, 
			0.22493558173890055, 
			0.20838106987540295, 
			0.19339643081748278, 
			0.17863129172199482, 
			0.17226310289288568, 
			0.16814373179236572, 
			0.1691945743839926, 
			0.17031927951004316, 
			0.17325836607752726, 
			0.17474751142634892, 
			0.17655422098373366, 
			0.17674166531262883, 
			0.17766115751731232, 
			0.177981458863895, 
			0.18087798511274247, 
			0.18363927666163488, 
			0.18744672205846533, 
			0.19051527323389672, 
			0.19363158834526484, 
			0.19582741197609266, 
			0.19780008493705775, 
			0.19903604752885778, 
			0.20027463912527166, 
			0.20118385350535162, 
			0.2026137562031137, 
			0.20391480109950716, 
			0.20540971883037917, 
			0.2067126688670648, 
			0.2080195066756545, 
			0.20916133756311406, 
			0.21026338905161585, 
			0.21128211249854378, 
			0.21227328795749148, 
			0.21327099160765428, 
			0.21426113854493725, 
			0.2153751658003876, 
			0.21659058359784789, 
			0.21808313305721047, 
			0.2197559095469082, 
			0.22183841746669097, 
			0.22407686155880274, 
			0.22677125405080223, 
			0.22937511904719665, 
			0.23233557468275193, 
			0.23474393381657746, 
			0.23774370032724504, 
			0.2409108053470057, 
			0.2452643561953506, 
			0.2501940792548283, 
			0.2566697195823532, 
			0.2635319127214353, 
			0.2718399630098841, 
			0.27943822225359594, 
			0.28779889059456903, 
			0.2936839898044633, 
			0.30079783389229275, 
			0.30772452545935997, 
			0.3172475483441899, 
			0.3274997253172043, 
			0.34064168816218326, 
			0.3536069294209164, 
			0.3684072664013864, 
			0.38026174096369086, 
			0.3917490806017311, 
			0.3968426407555975, 
			0.4015394337892147, 
			0.40418699456358426, 
			0.4075953343860165, 
			0.4106208803738213, 
			0.41453499029421226, 
			0.41843072258453146, 
			0.42298922672845113, 
			0.4272716519615867, 
			0.43169669021087415, 
			0.43508574691624446, 
			0.438196491342031, 
			0.4406155597552536, 
			0.44286319563632554, 
			0.44473482857866264, 
			0.44656557021512044, 
			0.44819636519323075, 
			0.4498492849027273, 
			0.4513096636053472, 
			0.45273617395040333, 
			0.4538026321288903, 
			0.4547906757091402, 
			0.45557121661676747, 
			0.4563674381054416, 
			0.4570728578642787, 
			0.45786756456212424, 
			0.4585960483426826, 
			0.45943078939616455, 
			0.4600957228504813, 
			0.46081327330634886, 
			0.4611488405926109, 
			0.46164640438906285, 
			0.46209343967929434, 
			0.46295794064724455, 
			0.46394186457878234, 
			0.4654969990290243, 
			0.46708423110448993, 
			0.4692445078535645, 
			0.47096981888380823, 
			0.4730942119616291, 
			0.4740007162998089, 
			0.475861269408208, 
			0.47789395740095886, 
			0.48204192356839737, 
			0.4871588235763906, 
			0.4951964877200347, 
			0.5039514955119581, 
			0.5157475457897729, 
			0.5261496077920165, 
			0.5385396890598737, 
			0.545357073691867, 
			0.5556480566732388, 
			0.5656629129339433, 
			0.5827997280316273, 
			0.60159616643802, 
			0.6280406107538173, 
			0.6524746768315971, 
			0.680811062784934, 
			0.6983536635448966, 
			0.7143906918778141, 
			0.7130406979429423, 
			0.7139111291634334, 
			0.7128851681619569, 
			0.7169297729297844, 
			0.7224172444029061, 
			0.7316186469524861, 
			0.7418831746394062, 
			0.7542975853825417, 
			0.7666009868847976, 
			0.7794408122175194, 
			0.7902628797178061, 
			0.8003013181957304, 
			0.8086716073269345, 
			0.8162448716434234, 
			0.8226861280203026, 
			0.8286011758964416, 
			0.8338227980272788, 
			0.8387581674636747, 
			0.8431729839852611, 
			0.8472942965056023, 
			0.8506879468359315, 
			0.8536253227317973, 
			0.8559558969789803, 
			0.8579033797999944, 
			0.8594113618457241, 
			0.8606454365273548, 
			0.8615563513344003, 
			0.8622616999093784, 
			0.8626684207276003, 
			0.8628682498755056, 
			0.8627015453536325, 
			0.8623298175366945, 
			0.8616602757612499, 
			0.8607896174927812, 
			0.8595944547585411, 
			0.8581289471273547, 
			0.8562137805960568, 
			0.853911216593944, 
			0.8509722230913026, 
			0.8475566280266312, 
			0.8433578869462904, 
			0.8388353602337991, 
			0.8337332091421586, 
			0.8282821696314129, 
			0.8220224419424828, 
			0.8150796009777459, 
			0.8067648646627003, 
			0.7973259296927988, 
			0.7858137632826074, 
			0.772985462770846, 
			0.7576566984843616, 
			0.7420642930463323, 
			0.725458249333624, 
			0.7094333139589623, 
			0.6926902405532958, 
			0.6768559587134921, 
			0.6598755448538742, 
			0.6443803167249065, 
			0.6261023194493983, 
			0.6093205206850635, 
			0.5824506719657765, 
			0.5578789976913698, 
			0.5281173431977622, 
			0.5038930845254179, 
			0.4786195477983715, 
			0.46107004454893524, 
			0.4443803846802715, 
			0.43515015402136414, 
			0.4236203479703774, 
			0.41502903050180623, 
			0.3948292779946164, 
			0.37554830693019714, 
			0.3516192305299516, 
			0.33196095338254283, 
			0.3127634843722731, 
			0.29886563576080427, 
			0.28669487796235604, 
			0.2787646517210399, 
			0.2712308833632338, 
			0.2657853885518039, 
			0.2580666890622017, 
			0.25152578689252375, 
			0.24447322466284524, 
			0.23900689278273163, 
			0.23397442437362317, 
			0.23044962338663905, 
			0.22745473688151444, 
			0.22555705932077158, 
			0.2237736542598907, 
			0.22250830369287805, 
			0.2206659544574158, 
			0.21910526255298582, 
			0.21739235432909707, 
			0.2160692304692399, 
			0.21482461895740274, 
			0.2139579512653929, 
			0.21317436951117674, 
			0.2126610668009879, 
			0.21207444727730804, 
			0.2115952029823152, 
			0.2107941625517477, 
			0.21010136826063697, 
			0.2093197943809837, 
			0.2087617711190793, 
			0.2082084740679207, 
			0.207902054654316, 
			0.20751770322248325, 
			0.20731378317648227, 
			0.20674914481943155, 
			0.2062279326585521, 
			0.2049139144850472, 
			0.20391730156693252, 
			0.20283088314616501, 
			0.20259130684590448, 
			0.20260281979240688, 
			0.20375031430781107, 
			0.2048770171231556, 
			0.20697483826678362, 
			0.20747990859158305, 
			0.2076878238351124, 
			0.202413547321214, 
			0.19649229097623291, 
			0.18782769171974706, 
			0.18023436045009109, 
			0.1721703388528566, 
			0.16608633363817488, 
			0.1603502235985203, 
			0.15646310490464035, 
			0.1522912810857371, 
			0.14895427427001595, 
			0.14355628909642773, 
			0.1386117743018542, 
			0.13297369204710216, 
			0.12835014418628782, 
			0.1239252747624842, 
			0.12064876541437605, 
			0.11775938982692594, 
			0.11578188660749751, 
			0.11387842799248844, 
			0.11243333762320991, 
			0.11046073576596002, 
			0.1087892764263904, 
			0.10702568879240852, 
			0.10570989333049044, 
			0.1045469977217454, 
			0.10384812115424191, 
			0.10331658397459294, 
			0.10315820450058703, 
			0.10300536130232503, 
			0.1030641603183629, 
			0.10285584812817528, 
			0.10287385069896712, 
			0.10290952569011365, 
			0.10335368358874404, 
			0.10397858327587828, 
			0.10511639097273721, 
			0.1064047106669637, 
			0.108196242321377, 
			0.10984283569622721, 
			0.11184313890143041, 
			0.11317239005240705, 
			0.11511607350394312, 
			0.11719300443453295, 
			0.12054859020353652, 
			0.12450761423005337, 
			0.13018535583194374, 
			0.13629438678496864, 
			0.1441078855302408, 
			0.15108738225948998, 
			0.15905856005338406, 
			0.16381960409937807, 
			0.1703092870973292, 
			0.1765090533732654, 
			0.18652090127499463, 
			0.19742211388283223, 
			0.21262774976235485, 
			0.2266199975367508, 
			0.24262897925772964, 
			0.2507133338717584, 
			0.255683071425257, 
			0.24405524649241844, 
			0.2309638125612567, 
			0.21321397398428896, 
			0.19896583781263288, 
			0.18548334315800927, 
			0.1762810187569288, 
			0.16861636610672678, 
			0.16410515780632143, 
			0.15989379039038315, 
			0.15709734769560385, 
			0.15261224613390267, 
			0.14887302859844764, 
			0.14474389768586535, 
			0.14163485348901758, 
			0.13878374117963263, 
			0.13688982371558894, 
			0.1353209174306752, 
			0.13444031258855785, 
			0.1336233655451168, 
			0.13312057036436392, 
			0.13224147506688827, 
			0.13150943797441125, 
			0.1306610491308063, 
			0.1300202773573149, 
			0.129414871322533, 
			0.129014935553462, 
			0.1286773076675837, 
			0.12849300047842602, 
			0.1283175354171155, 
			0.12821266310404514, 
			0.12801527402502152, 
			0.1278499551596707, 
			0.12765388011129536, 
			0.12750534404627384, 
			0.12736336180956892, 
			0.12726956099395798, 
			0.12718973767313246, 
			0.12714625313943756, 
			0.1271043110572796, 
			0.12707889525416954, 
			0.1270303755283903, 
			0.12698853761877113, 
			0.12693752981659429, 
			0.1268951995218973, 
			0.12684966909365597, 
			0.12680747857141697, 
			0.12675422051777446, 
			0.1266842316986398, 
			0.12656985876105425, 
			0.12638020754737697, 
			0.12604531660160695, 
			0.12546460138807886, 
			0.12444469241600249, 
			0.12265414853164351, 
			0.11949767208234537, 
			0.113928755503748, 
			0.10409269517926958, 
			0.08671443568166935, 
			0.05600282759014217, 
			0.0
	};
	
	private double[] rightMotorSpeeds = {
			0.0, 
			0.14646025439423588, 
			0.2283454920490371, 
			0.27467257069173273, 
			0.30088323630092817, 
			0.3157127004501852, 
			0.32410393536407833, 
			0.32885159970539013, 
			0.331538722067775, 
			0.3330575428009073, 
			0.33391650909278253, 
			0.33439783663946493, 
			0.33466933183696934, 
			0.33482026740265264, 
			0.3349072597205795, 
			0.3349557781679847, 
			0.3349869067812334, 
			0.3350031061930402, 
			0.33501524991131115, 
			0.335014092069997, 
			0.33501064876011255, 
			0.33498727228488134, 
			0.3349692128726346, 
			0.33494641347698534, 
			0.33493917046736876, 
			0.33493136452882843, 
			0.3349417583821704, 
			0.3349417193991009, 
			0.334954250241832, 
			0.33492888879938426, 
			0.3349039938869064, 
			0.33480289783282563, 
			0.3347274552721296, 
			0.3346353780523014, 
			0.33460994815274325, 
			0.33458531592688423, 
			0.33463929335031506, 
			0.3346551875614209, 
			0.33472875228567855, 
			0.3346528597825282, 
			0.33458667604476394, 
			0.33421238837188466, 
			0.33395539051016676, 
			0.3336461022728531, 
			0.3336379467348408, 
			0.33367000625764626, 
			0.3340782043810897, 
			0.33439253279101794, 
			0.3350259848143019, 
			0.3351123142136503, 
			0.3353223349867839, 
			0.334263273850034, 
			0.33378165756139366, 
			0.3331978358964792, 
			0.3340765268731105, 
			0.3353977389603587, 
			0.3386106098598313, 
			0.34170799198234336, 
			0.3462458117473197, 
			0.34794122160010343, 
			0.3488586560430392, 
			0.3410993727695548, 
			0.33229039469615984, 
			0.31965058682452085, 
			0.3087042832677425, 
			0.29740410802043155, 
			0.2889458076356872, 
			0.28117630936215987, 
			0.2758889975309463, 
			0.27044823269182433, 
			0.266150462366905, 
			0.2596884790579742, 
			0.253901058456948, 
			0.24752423419288241, 
			0.2423531116298451, 
			0.2374977297227372, 
			0.23388730566475116, 
			0.23073487103779394, 
			0.22851661881529867, 
			0.2264326284142018, 
			0.22480173174878618, 
			0.2227458347212961, 
			0.2209337148994046, 
			0.21902971974756022, 
			0.21742432423630312, 
			0.215909560872257, 
			0.21465184155293415, 
			0.2135186456836867, 
			0.21254977055097463, 
			0.21168799582009737, 
			0.21089371416501174, 
			0.21018375451025567, 
			0.20941690068558305, 
			0.20862887898519816, 
			0.20765035264126377, 
			0.20660843231632775, 
			0.20529039133776403, 
			0.2039938215594424, 
			0.2024331079168277, 
			0.20120339095703615, 
			0.1998453494417815, 
			0.19930733502687303, 
			0.19838293778444088, 
			0.19756897354937827, 
			0.1958717379463992, 
			0.19405464481993778, 
			0.19123271848159967, 
			0.18878194797722722, 
			0.18572107720379918, 
			0.18443927820846176, 
			0.18340604403759195, 
			0.18602332230512061, 
			0.18823880442567137, 
			0.19173623767166806, 
			0.19376047816975728, 
			0.19676573054414864, 
			0.198832591405193, 
			0.20378114592559302, 
			0.2096338508786208, 
			0.22170370352404425, 
			0.2364226668301514, 
			0.25946560575855254, 
			0.28191377009130736, 
			0.30493180047008034, 
			0.3244346944368577, 
			0.3419560852027888, 
			0.3560538611155253, 
			0.3683703956485661, 
			0.3783762819364733, 
			0.387649576400208, 
			0.3957121701335377, 
			0.4040237810911754, 
			0.4112496959759005, 
			0.4179500104082418, 
			0.4234305077555967, 
			0.42817249371612104, 
			0.43189736995404526, 
			0.4350530178176548, 
			0.4375149844332021, 
			0.43971464375358477, 
			0.44151667003868356, 
			0.4433485709569596, 
			0.4448167597387244, 
			0.4460980598212251, 
			0.44693605474800807, 
			0.4474969346646457, 
			0.4476116684821981, 
			0.44748566477444546, 
			0.4469672599339963, 
			0.44636107336752556, 
			0.44546428495075485, 
			0.44471848163221434, 
			0.443597546798863, 
			0.4422899157716394, 
			0.44031455680498394, 
			0.4379086195961076, 
			0.4345933049387556, 
			0.43082347740633675, 
			0.4260525118728672, 
			0.42120989685212107, 
			0.4155387849182749, 
			0.41062173486306375, 
			0.4044949326511649, 
			0.39786279369650085, 
			0.38883570028967296, 
			0.37840130956346485, 
			0.36465290143723583, 
			0.34968905662682487, 
			0.33143231453015914, 
			0.31444284287952723, 
			0.2959827452631265, 
			0.28406352949278757, 
			0.27059351301983475, 
			0.25985591071322667, 
			0.2452541481672253, 
			0.2331985154050938, 
			0.21897171638237367, 
			0.2139824940012681, 
			0.2138622379574052, 
			0.23508421634973975, 
			0.26790420210676263, 
			0.3275782555564307, 
			0.38778475325997847, 
			0.45030112468279027, 
			0.5037343778745307, 
			0.5517054939435158, 
			0.5906860445036648, 
			0.6247876548836939, 
			0.6529487496327102, 
			0.6789711983467391, 
			0.7018461015422035, 
			0.7248041181710122, 
			0.7448256303508948, 
			0.7631430679739754, 
			0.7783104778960042, 
			0.7914356037578445, 
			0.8020471791558954, 
			0.8111506903259306, 
			0.8186131693824565, 
			0.8253088538192788, 
			0.8310684617409786, 
			0.8366277904464783, 
			0.8413649953147024, 
			0.8455807197758036, 
			0.848951800057451, 
			0.8517340930548064, 
			0.853803712669871, 
			0.8553882406039358, 
			0.8564373568158201, 
			0.8571579802890273, 
			0.8574999012717706, 
			0.8576608612742644, 
			0.8574791909326553, 
			0.8570086145904756, 
			0.8561100912812224, 
			0.8547915619125442, 
			0.8529300019356654, 
			0.8505236779225882, 
			0.8474659980205701, 
			0.8438021677958775, 
			0.83946844057986, 
			0.8346150562857888, 
			0.8291302344105199, 
			0.8229573605642232, 
			0.8157967236517975, 
			0.8074443569986096, 
			0.7974743248733602, 
			0.7856907919082162, 
			0.7716646573566743, 
			0.7554934358318042, 
			0.7369325804147765, 
			0.7167064828333476, 
			0.694316076141208, 
			0.6696453217029138, 
			0.6412689176607193, 
			0.6085272451646132, 
			0.5693202895717031, 
			0.5234525356611597, 
			0.46883078338874123, 
			0.40857923490603054, 
			0.34245647934849366, 
			0.28373681829631575, 
			0.22929008681934615, 
			0.187901249172173, 
			0.15202395741759084, 
			0.12670497479847737, 
			0.10307974423257102, 
			0.08583136900202266, 
			0.06771049937490563, 
			0.056895402264340554, 
			0.04826018785610123, 
			0.05156370927531443, 
			0.058437683188539494, 
			0.07335014234869622, 
			0.08687692424140352, 
			0.10200528133653286, 
			0.11335582757578162, 
			0.12402491662040427, 
			0.13119231725583064, 
			0.1384809029613005, 
			0.14404591417175455, 
			0.1521449652456142, 
			0.15920479708432447, 
			0.16684672958077235, 
			0.17289309548523676, 
			0.178470345121192, 
			0.18247088583388082, 
			0.1858733359094142, 
			0.18810155139024998, 
			0.19014664960077776, 
			0.19160132989080067, 
			0.193562766743164, 
			0.19516111167444908, 
			0.19682241131719502, 
			0.19799300427958913, 
			0.19896884742685328, 
			0.1994394814061148, 
			0.1996767813252091, 
			0.19948774610850603, 
			0.19918964814350634, 
			0.19861550201106534, 
			0.19817358239093283, 
			0.19748133163733445, 
			0.19669181151353943, 
			0.1954820551060516, 
			0.19397720765184917, 
			0.1918923935062014, 
			0.18942728776061366, 
			0.1862979841463238, 
			0.18292485010851664, 
			0.17897674553082482, 
			0.17522406676335514, 
			0.17080308275498834, 
			0.1659956420272754, 
			0.15988603593160808, 
			0.15278555647043582, 
			0.1437339145803816, 
			0.13355387711540065, 
			0.12131157981067904, 
			0.10937821820382132, 
			0.09700014689200478, 
			0.08955747586371068, 
			0.08352516240685622, 
			0.081163185731436, 
			0.07913351635111304, 
			0.07875133316026042, 
			0.07757650424672696, 
			0.0769021395250096, 
			0.07513115578963203, 
			0.0741244047247769, 
			0.0727635222105171, 
			0.07382143947690763, 
			0.07497773322790019, 
			0.07730832659312054, 
			0.07915042122703433, 
			0.08120714116431635, 
			0.08249708441324696, 
			0.08367085708483023, 
			0.08416342027160573, 
			0.08473160708214977, 
			0.08498112323561283, 
			0.08585906390524126, 
			0.08657630480278458, 
			0.08750390700451328, 
			0.08811002496927597, 
			0.08865946490015572, 
			0.08883211623153411, 
			0.08889540526284906, 
			0.08863312731831986, 
			0.08839090486141941, 
			0.08796107811034017, 
			0.08781126356590924, 
			0.08746099905418085, 
			0.08711046034297927, 
			0.08637029712876318, 
			0.08545475341184967, 
			0.08402707260443236, 
			0.08243473190324399, 
			0.08032178187116785, 
			0.0783243123488178, 
			0.07594976073943913, 
			0.07421819845623974, 
			0.07186585136379807, 
			0.06936935261682008, 
			0.06559456384309134, 
			0.06121281441803088, 
			0.05513244963314999, 
			0.04866679148287696, 
			0.04062873452637629, 
			0.033682978517533615, 
			0.026271413452915275, 
			0.022996311431527035, 
			0.019694003960451144, 
			0.019601333170873876, 
			0.02083172442516775, 
			0.02660559543558924, 
			0.038597441020903164, 
			0.050308086539274224, 
			0.06439620488242064, 
			0.07062466891575335, 
			0.07393469507592573, 
			0.06129086765393778, 
			0.049261056308872134, 
			0.03661761380037724, 
			0.034782566391814325, 
			0.04086268797193339, 
			0.04738938911111444, 
			0.05500704643944099, 
			0.06084113911902349, 
			0.06715771760047297, 
			0.07239979974458535, 
			0.07949427780331354, 
			0.08570987972590605, 
			0.09213239734953298, 
			0.09725058748253015, 
			0.10186827144111443, 
			0.10528063793147886, 
			0.10818733389715271, 
			0.11024384936856704, 
			0.11213142229635878, 
			0.11360169414856917, 
			0.11537259628975034, 
			0.116884603941947, 
			0.11841627308240373, 
			0.11963407359110427, 
			0.12073270022333402, 
			0.12154764025071738, 
			0.12224432650891877, 
			0.12273954846060953, 
			0.12319437405202498, 
			0.12354898124944096, 
			0.12397449032968422, 
			0.12433801067533463, 
			0.12470676280792821, 
			0.12500048220851773, 
			0.12526605242152264, 
			0.12546343012496655, 
			0.1256324646570044, 
			0.12575276331985336, 
			0.12586317607162684, 
			0.1259490275538759, 
			0.126051562147855, 
			0.1261382757302593, 
			0.12622485144203702, 
			0.12629072644842015, 
			0.12634524959541285, 
			0.12637523777696086, 
			0.1263840349604172, 
			0.12635580109076422, 
			0.12628030439490345, 
			0.12611982908769998, 
			0.1258232943122031, 
			0.12527601803507193, 
			0.12429192306704136, 
			0.12253119180700259, 
			0.1194031204820916, 
			0.11385739112356723, 
			0.10404251234972002, 
			0.08668213913746849, 
			0.05598720639919179, 
			0.0
	};

	public int nSteps() {
		return leftMotorSpeeds.length;
	}
	
	public double leftSpeed(int i) {
		return leftMotorSpeeds[i];
	}
	public double rightSpeed(int i) {
		return rightMotorSpeeds[i];
	}


}

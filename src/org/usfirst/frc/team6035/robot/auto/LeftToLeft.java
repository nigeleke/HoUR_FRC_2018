package org.usfirst.frc.team6035.robot.auto;

import org.usfirst.frc.team6035.robot.*;

public class LeftToLeft extends AutoDirection {
	
	public LeftToLeft() {
	super(Config.LEFT_TO_LEFT_COMPENSATION);	
	}
	
	double[] LeftMotorSpeeds = { 0.0,
			0.0, 
			0.09140182100724645, 
			0.14257820721131093, 
			0.1715302835650787, 
			0.187908954119609, 
			0.19717419438538847, 
			0.2024147379695457, 
			0.20537815651675806, 
			0.20705277769366776, 
			0.20799805461263632, 
			0.20852993358812283, 
			0.2088278160205453, 
			0.2089923341865901, 
			0.20908176588505056, 
			0.20912777418681902, 
			0.20915087488504747, 
			0.20916045320844182, 
			0.2091660528121751, 
			0.20916755848573657, 
			0.20916793310655585, 
			0.2091656492792285, 
			0.20916196451770208, 
			0.2091552513001962, 
			0.2091463327852336, 
			0.20913337591586703, 
			0.20911735133278916, 
			0.20909594498363182, 
			0.2090710639442482, 
			0.20903981161788257, 
			0.20900659018143686, 
			0.20896810565424886, 
			0.20893389267522372, 
			0.208899673549534, 
			0.20888144812807674, 
			0.20886436696819763, 
			0.20885316801486487, 
			0.2088367249019115, 
			0.20881789461135206, 
			0.2087883359765715, 
			0.20875075495528103, 
			0.2086970413144152, 
			0.2086310090195461, 
			0.2085429308393291, 
			0.20844061521452972, 
			0.20831205654406748, 
			0.20817537388592605, 
			0.20801696755590018, 
			0.207876143157412, 
			0.20773527827945265, 
			0.20766044117544036, 
			0.20759036018375596, 
			0.2075446294716937, 
			0.20747725830586564, 
			0.2074000465667048, 
			0.20727847628301155, 
			0.20712369936640015, 
			0.20690211064192385, 
			0.20662939283817322, 
			0.20626515176480145, 
			0.20584153795978413, 
			0.2053085624534988, 
			0.20474119511438746, 
			0.2040827404820696, 
			0.20349694503610985, 
			0.20291054279111886, 
			0.20260086020661955, 
			0.20231117617112887, 
			0.2021241996321105, 
			0.20184554984238173, 
			0.201524788332331, 
			0.20101489712528114, 
			0.20036241387135764, 
			0.19942297521844263, 
			0.19826170023325146, 
			0.1967031530087495, 
			0.19488204101132528, 
			0.19257876168851637, 
			0.19011443454269003, 
			0.18723895013979228, 
			0.18467446716370142, 
			0.18210234493307603, 
			0.180785423719709, 
			0.17956844010518058, 
			0.17883763645577472, 
			0.17768973287760093, 
			0.17635157422909087, 
			0.17412440239545998, 
			0.1712154824484265, 
			0.16692417763221964, 
			0.16153476864056066, 
			0.15417218191533266, 
			0.14544973250527132, 
			0.1342497176014305, 
			0.12218059463456939, 
			0.10801979329136246, 
			0.09583617222071575, 
			0.0843080947829791, 
			0.08144086521576605, 
			0.08098112271705071, 
			0.08565749417491388, 
			0.09053868825983379, 
			0.09711595441104236, 
			0.10242907089624194, 
			0.10763967164637114, 
			0.11112166096950149, 
			0.11385546875089118, 
			0.11488574023092661, 
			0.11512565668494093, 
			0.11389053220970494, 
			0.1122994011576551, 
			0.10976465057994336, 
			0.10807845392935897, 
			0.10654446387913179, 
			0.10789345817008371, 
			0.10967493035538349, 
			0.11272970979225143, 
			0.11544881223391415, 
			0.11835961598073204, 
			0.12062462068318888, 
			0.12266503682515457, 
			0.12406171347471709, 
			0.12514822124894126, 
			0.12568880231451313, 
			0.12596801580868586, 
			0.12581689920649503, 
			0.12555368098874034, 
			0.12502948848672207, 
			0.1247200021017361, 
			0.12444048695113155, 
			0.12488548451800612, 
			0.12542143537660694, 
			0.12625900655090824, 
			0.126996420808327, 
			0.12776833169632346, 
			0.12837269665914028, 
			0.1289158217905079, 
			0.129301087806535, 
			0.12960922158404048, 
			0.1297900989480074, 
			0.12990651214582913, 
			0.12992667043723088, 
			0.1299112700289806, 
			0.12983607240353973, 
			0.1297821447306621, 
			0.12972404508809382, 
			0.12977547677659912, 
			0.12984636100400265, 
			0.12997166611922253, 
			0.1300973166133994, 
			0.13024180819085773, 
			0.13038473606242548, 
			0.13053507669501557, 
			0.13069483510886126, 
			0.130860153028513, 
			0.1310493120699876, 
			0.1312368056074074, 
			0.13145483510918382, 
			0.13163769526674468, 
			0.1318317619265556, 
			0.13190043365191523, 
			0.13192313178748194, 
			0.1316819725929097, 
			0.131436572959846, 
			0.13112298412570528, 
			0.13091923304881375, 
			0.13076764337776006, 
			0.1307890371602356, 
			0.13091390632378447, 
			0.13125510725529171, 
			0.13171403310348245, 
			0.13243103733442613, 
			0.1332305343170242, 
			0.1343003011526644, 
			0.13528262587549097, 
			0.13642258483730743, 
			0.13699770829770647, 
			0.13739680525280845, 
			0.13643480471505942, 
			0.13542718553826663, 
			0.13401473348651388, 
			0.13313058869935726, 
			0.1324879352523713, 
			0.13273402958746425, 
			0.13355481091976734, 
			0.13556179333932472, 
			0.13833823031052736, 
			0.1426592933508233, 
			0.1477716331240766, 
			0.1547252245291027, 
			0.16181263490863612, 
			0.17031898478469182, 
			0.17621400997029651, 
			0.18116249144056185, 
			0.17737019860256334, 
			0.17175859294997692, 
			0.16166107389612816, 
			0.152232442577207, 
			0.14183626665077165, 
			0.13343733791163095, 
			0.12568956010393734, 
			0.12016392751485538, 
			0.1157230741873598, 
			0.11326782723404297, 
			0.11176303235214909, 
			0.11185923973227865, 
			0.11233966630846073, 
			0.1137908220621147, 
			0.11433475614166062, 
			0.11472370919824379, 
			0.11214754451712158, 
			0.10923658863832927, 
			0.1051259736067306, 
			0.10151425483476131, 
			0.09783210130305872, 
			0.09494613617015459, 
			0.09238987173012815, 
			0.09058754163773126, 
			0.08916618721736794, 
			0.0883611515567521, 
			0.08785361288705087, 
			0.0878143568148027, 
			0.08788987793326944, 
			0.08823742970883107, 
			0.08833679881627296, 
			0.08839677980466168, 
			0.08766735325624207, 
			0.08686166292605897, 
			0.08575376693941657, 
			0.08479207173644268, 
			0.08382502832769055, 
			0.08307776185660248, 
			0.08242524467261443, 
			0.08197862188385882, 
			0.08163674860110962, 
			0.08146457566869239, 
			0.08137202408792372, 
			0.08141023456374558, 
			0.08147245460790448, 
			0.08160926056890572, 
			0.08165611165163963, 
			0.08168378143369207, 
			0.08145155618143053, 
			0.08119846323252412, 
			0.08085250137627428, 
			0.0805666449807627, 
			0.08028969946698024, 
			0.08010472756299544, 
			0.07996507658532118, 
			0.07992239445384944, 
			0.07993023331076216, 
			0.08003344191336755, 
			0.0801726758723563, 
			0.08039815839030137, 
			0.08060974838105577, 
			0.08086858301828329, 
			0.08098901573560423, 
			0.08106667861678171, 
			0.08081163929149496, 
			0.08054220002008199, 
			0.08017211806328702, 
			0.07991763513156809, 
			0.07970915372540624, 
			0.07968654755706578, 
			0.07977360351132193, 
			0.08009114302176684, 
			0.08053973263598312, 
			0.08126197527991327, 
			0.08208899440739419, 
			0.083207472188486, 
			0.08427545361403121, 
			0.0855321755657506, 
			0.08627730768074574, 
			0.08687955173447383, 
			0.08616726538281475, 
			0.085407239399838, 
			0.08423997441600083, 
			0.0835871468188262, 
			0.08317678024879957, 
			0.08366908691519734, 
			0.08477968142792844, 
			0.08715452986361208, 
			0.09042888795189112, 
			0.09544856641227895, 
			0.10154373265468213, 
			0.10989332423307414, 
			0.11886445189917731, 
			0.12990490411808622, 
			0.13875683652614842, 
			0.14708720330088432, 
			0.14571804832730992, 
			0.1420266552217405, 
			0.13245543335315738, 
			0.12309309516238513, 
			0.11187378220052753, 
			0.10265390813402923, 
			0.0938154125375241, 
			0.08755238221897718, 
			0.0824776090178638, 
			0.07990007772780773, 
			0.07850689097889976, 
			0.07924927235789415, 
			0.08051049774416591, 
			0.0831307931244048, 
			0.08450608734876824, 
			0.08566660547919733, 
			0.08258352674702786, 
			0.07893816935163804, 
			0.07346582051171534, 
			0.06861342759666547, 
			0.0635688122354362, 
			0.05961277342587603, 
			0.0560830745487791, 
			0.05362069835121228, 
			0.051691383953914725, 
			0.050657330124788, 
			0.05005387165365791, 
			0.050146505590880665, 
			0.0504073809284535, 
			0.05108040201396794, 
			0.051372603529570106, 
			0.051603548627576976, 
			0.050616417813056744, 
			0.04950507051064089, 
			0.04791997779689263, 
			0.04655658231859813, 
			0.04518205142242902, 
			0.04415396285414097, 
			0.04327890644258733, 
			0.042744024101008415, 
			0.04238734337171514, 
			0.04233089833978304, 
			0.04241726210357224, 
			0.04275369310542754, 
			0.04312976211742259, 
			0.04365741289284144, 
			0.04398530918156595, 
			0.04427099647136421, 
			0.04398415153209268, 
			0.043655033531488634, 
			0.043126085670905735, 
			0.04274845496773076, 
			0.04241021995257974, 
			0.04232149940759209, 
			0.04237513570903119, 
			0.04272808186024722, 
			0.04325857987956519, 
			0.04412790135428252, 
			0.0451495905731648, 
			0.04651609375916077, 
			0.04787145777310921, 
			0.049447305921109595, 
			0.05055171014811449, 
			0.05153241905996535, 
			0.051301527019207184, 
			0.05100967671975422, 
			0.05033911492936756, 
			0.05007823639595492, 
			0.049984447085894404, 
			0.050582255807951934, 
			0.05160756420058804, 
			0.053521777567254715, 
			0.05596463742506884, 
			0.05946631027090001, 
			0.06338953331750062, 
			0.06839114307630964, 
			0.07319887006776894, 
			0.07861831715415504, 
			0.0822218207614562, 
			0.08526492819870186, 
			0.08410078242208688, 
			0.08272415317529232, 
			0.08011565815904902, 
			0.07885285387601292, 
			0.07810290408934467, 
			0.07946266867014098, 
			0.081988629878087, 
			0.08697430374246988, 
			0.09312156659949081, 
			0.10179358703018812, 
			0.11081829527981615, 
			0.12178309436509131, 
			0.13088502449716244, 
			0.14015534971355348, 
			0.1436294250251962, 
			0.14481821891205707, 
			0.13656379392584528, 
			0.12784279471354082, 
			0.11705299628100116, 
			0.10831244997887865, 
			0.10021388994405242, 
			0.09431582664921749, 
			0.08947374600706814, 
			0.08631974747116919, 
			0.08403696784215245, 
			0.08296829323213079, 
			0.082494237299263, 
			0.08288266645486067, 
			0.0835052304257086, 
			0.08461838307050075, 
			0.08534987351683004, 
			0.08603853253135246, 
			0.08548993967583761, 
			0.08480603345700868, 
			0.08363966146740379, 
			0.08264683112828791, 
			0.08160290266493184, 
			0.08082628939957986, 
			0.08014284148662514, 
			0.07970771309745653, 
			0.07938972940481982, 
			0.07927758289005903, 
			0.07926360294399129, 
			0.07941303364234673, 
			0.07960679596117481, 
			0.07990212979820138, 
			0.08012037923446169, 
			0.08032976537514691, 
			0.0802698165753934, 
			0.08017071856004457, 
			0.0799537531554377, 
			0.07976423916946221, 
			0.07955346580320526, 
			0.07939563089780613, 
			0.07925322335542652, 
			0.07916365514336489, 
			0.07909821376388812, 
			0.07907853785592857, 
			0.0790805211478384, 
			0.07911996960294325, 
			0.0791695654853265, 
			0.07924297197499122, 
			0.07929835375193546, 
			0.07935162934478769, 
			0.07934085736867748, 
			0.07932022465673896, 
			0.07927083607996155, 
			0.07922737284296212, 
			0.07917826175715102, 
			0.07914141812018663, 
			0.0791079480989766, 
			0.07908695419926108, 
			0.07907160478987618, 
			0.07906717674172661, 
			0.07906790641171615, 
			0.07907763996355524, 
			0.07908981336091056, 
			0.07910773805551116, 
			0.07912131856336756, 
			0.07913438993905171, 
			0.07913195304593593, 
			0.0791270910159292, 
			0.0791152170480732, 
			0.07910472820109915, 
			0.07909282179498807, 
			0.07908383899974109, 
			0.07907562635466184, 
			0.07907037687386481, 
			0.07906643113351172, 
			0.07906502832940666, 
			0.0790647513037609, 
			0.07906643326710151, 
			0.07906840417844385, 
			0.07907120659833976, 
			0.07907209802932437, 
			0.07907125277224954, 
			0.07906395833367512, 
			0.07905101381135761, 
			0.07902746578556366, 
			0.07898834893854201, 
			0.07892086266328566, 
			0.07880448241697859, 
			0.07860074501399679, 
			0.07824296392516071, 
			0.07761213440217173, 
			0.07649871319599053, 
			0.0745317375991941, 
			0.0710559840213981, 
			0.06491299859445726, 
			0.05405538505686004, 
			0.034864056932020354, 
			0.0
};
	
	double[] RightMotorSpeeds = {
			0.0, 
			0.09140320274266081, 
			0.14258109032794877, 
			0.1715348362475601, 
			0.18791556523754926, 
			0.19718322698914964, 
			0.20242692636880358, 
			0.2053940922934864, 
			0.207073644235586, 
			0.20802464547253288, 
			0.20856392701705095, 
			0.208869939282621, 
			0.2090445263256135, 
			0.20914378993698524, 
			0.20920092458283443, 
			0.2092319484356444, 
			0.20924858228937135, 
			0.20925311814474692, 
			0.2092532144473664, 
			0.20924970400179718, 
			0.20924651480235096, 
			0.2092432610161275, 
			0.20924210217162495, 
			0.20924203123479468, 
			0.20924473359319476, 
			0.20924860589306812, 
			0.2092555619954982, 
			0.20926279530877617, 
			0.2092728094458159, 
			0.20928020060854519, 
			0.20928834443869687, 
			0.20928704508702864, 
			0.20928210624943025, 
			0.20925793424380795, 
			0.2092332860869459, 
			0.2092036039887748, 
			0.20918122405060582, 
			0.2091618995153351, 
			0.20915336963294068, 
			0.2091505471407183, 
			0.20916002611086623, 
			0.20917485161452584, 
			0.20920280585543122, 
			0.20923220334592507, 
			0.20927333554001062, 
			0.2093039117732272, 
			0.20933783342096296, 
			0.20933306512291167, 
			0.20931347481718734, 
			0.20921465536676345, 
			0.20911388366157788, 
			0.20899230525621162, 
			0.20890086705797187, 
			0.20882208985933537, 
			0.2087880396907677, 
			0.20877784450466969, 
			0.20881893241491772, 
			0.20888282005349276, 
			0.20900199502961403, 
			0.2091285370314548, 
			0.20930550445907614, 
			0.20944100608341923, 
			0.20959306270858882, 
			0.2095869296012111, 
			0.20952139807379028, 
			0.20912599952090338, 
			0.2087225284254854, 
			0.20823130483714886, 
			0.20786681950843158, 
			0.20755653756372688, 
			0.2074376269653851, 
			0.2074243865600109, 
			0.20763646367604868, 
			0.20795745392426723, 
			0.2085314904254123, 
			0.2091611982513851, 
			0.2100395081035457, 
			0.2107789817513673, 
			0.21163718627464084, 
			0.21185058630467904, 
			0.21184254150394582, 
			0.21038038231867282, 
			0.20887934599968214, 
			0.20696700037039212, 
			0.2056271467064072, 
			0.20454600130412723, 
			0.20438762209659928, 
			0.20479988011800035, 
			0.20639694625387112, 
			0.20871283496191265, 
			0.2125223716850532, 
			0.21700531950604648, 
			0.22321738881012138, 
			0.22936047298862827, 
			0.23675256664282213, 
			0.24126666156955992, 
			0.24469042273341643, 
			0.23922016899345827, 
			0.23206096766279552, 
			0.22060320505575676, 
			0.21006656163420795, 
			0.19879734408093724, 
			0.18972074711325526, 
			0.18145395375411422, 
			0.17551399900912643, 
			0.17073665833422325, 
			0.16798007177378885, 
			0.1661969797039366, 
			0.16600687999566524, 
			0.16619886874091477, 
			0.16733875271071752, 
			0.16758651218543658, 
			0.16768421640680986, 
			0.16490849685160064, 
			0.16183863265871865, 
			0.15764072757626152, 
			0.15396388782045473, 
			0.1502519820291914, 
			0.14733735145322757, 
			0.14476257840498905, 
			0.14292994380125149, 
			0.14147505414024228, 
			0.14061765871066817, 
			0.14004958648423285, 
			0.13992831520838356, 
			0.1399183976493237, 
			0.14016453084381073, 
			0.14018134813630864, 
			0.1401626015742074, 
			0.13941516327012252, 
			0.13860016109958856, 
			0.13750918280331062, 
			0.1365539121237731, 
			0.13559406107159913, 
			0.1348312692806403, 
			0.13415097682480812, 
			0.13364594162873095, 
			0.13322735557753265, 
			0.13294101543277304, 
			0.13271681347173228, 
			0.13258309586939837, 
			0.1324728671034526, 
			0.1324096336153471, 
			0.13230847207416518, 
			0.132200651126746, 
			0.13197379638469547, 
			0.1317341333436866, 
			0.1314477546842671, 
			0.13117418474213877, 
			0.13089024329141424, 
			0.13061483826237574, 
			0.13033117198197813, 
			0.13003260258541727, 
			0.12971327442409974, 
			0.12934906172429064, 
			0.12895408884899384, 
			0.12849109063258657, 
			0.12801390376379612, 
			0.12747676910788847, 
			0.1270086116028431, 
			0.12654700406881234, 
			0.12631433097411457, 
			0.12609469634171602, 
			0.12595417617674812, 
			0.12572839951230355, 
			0.12545986914870327, 
			0.12502139280083965, 
			0.12445661820145053, 
			0.12363643699881946, 
			0.12262569487775614, 
			0.12126343527326973, 
			0.11968408064388772, 
			0.11768223955374486, 
			0.11557206510329784, 
			0.1131131062297418, 
			0.11100053199237021, 
			0.10891373460954742, 
			0.10805733809187786, 
			0.10728593818064805, 
			0.1069679368128716, 
			0.10622324252183897, 
			0.10528216664662249, 
			0.10347541691888287, 
			0.10102320393390274, 
			0.09725922747097401, 
			0.09248442472285069, 
			0.08586391472816889, 
			0.07802617532945008, 
			0.06790040093093005, 
			0.057105115288830874, 
			0.04448281164692945, 
			0.03413887694133691, 
			0.024922956963216846, 
			0.022075368292368856, 
			0.021987315340832748, 
			0.027150092005620567, 
			0.03255357844232076, 
			0.03965681284406379, 
			0.0454367846934831, 
			0.0510694237129782, 
			0.0548992449108104, 
			0.05793266952755145, 
			0.05919964728567724, 
			0.059641997701718255, 
			0.058563700627916236, 
			0.057117897387769255, 
			0.054702794852758606, 
			0.05316301699136494, 
			0.051777858325016655, 
			0.053362316098831165, 
			0.0553760264621197, 
			0.058689034846003615, 
			0.06163134231611801, 
			0.06475260389999891, 
			0.06718299526415962, 
			0.06936389340313617, 
			0.07085944954352649, 
			0.07202108590826248, 
			0.07260229821114503, 
			0.07290531189603572, 
			0.07275128791270212, 
			0.07248157300011498, 
			0.07193600705470357, 
			0.07162795227776678, 
			0.07135509227798623, 
			0.07186848493669395, 
			0.07247470130393947, 
			0.07340129967067005, 
			0.0742069529175538, 
			0.07503916270617965, 
			0.07567249609728974, 
			0.0762260308877715, 
			0.07658582284262361, 
			0.07684715595403926, 
			0.07694193396800833, 
			0.07695488951003705, 
			0.07683237957846116, 
			0.0766765268144118, 
			0.07643627294972898, 
			0.0762733328956117, 
			0.07612135460338168, 
			0.07622207988574088, 
			0.07634858670452452, 
			0.07657364202954747, 
			0.07674830471712583, 
			0.07692019565246987, 
			0.07700506635994782, 
			0.077043619478571, 
			0.07698065781353425, 
			0.07685522087778629, 
			0.07661799360911363, 
			0.0763196126930997, 
			0.07590598728911543, 
			0.07546816178191708, 
			0.0749454987044316, 
			0.0745177624999631, 
			0.07410241517986371, 
			0.07399285947036408, 
			0.07390442369566724, 
			0.07392496192225001, 
			0.07384870158151502, 
			0.07373351635796592, 
			0.07343457721768964, 
			0.07300812020127553, 
			0.07232073910403805, 
			0.07144575643195214, 
			0.07022459624134243, 
			0.06879425389864695, 
			0.06695436117091354, 
			0.06501312661552591, 
			0.0627349487086162, 
			0.06079926161973587, 
			0.05889098814885353, 
			0.05819851706426378, 
			0.057590445221598875, 
			0.057439191847356276, 
			0.056874706263088125, 
			0.056142947898256454, 
			0.054598370842690036, 
			0.052508214310255284, 
			0.0492830710423787, 
			0.04537276378435663, 
			0.040195769077021555, 
			0.034874143166356966, 
			0.02918633129963078, 
			0.026416594597633635, 
			0.028262536962640757, 
			0.033982294593589826, 
			0.04260290402547973, 
			0.04348427660335558, 
			0.042755530512389076, 
			0.036399597892309045, 
			0.030187640938951255, 
			0.022155657073769614, 
			0.016378997642894952, 
			0.011815003563113585, 
			0.010157914581268286, 
			0.010511349606510758, 
			0.010321188839320879, 
			0.010221975162204675, 
			0.009014131270890884, 
			0.008369713124329091, 
			0.007899590476656804, 
			0.008335463474850913, 
			0.01010539974412609, 
			0.009121295738508065, 
			0.009433304914267342, 
			0.0108604530806765, 
			0.013258647281888266, 
			0.01677768187279812, 
			0.019767887006482406, 
			0.0226647474279795, 
			0.024700848010176486, 
			0.026327788341245557, 
			0.02713736156477961, 
			0.02756082976245198, 
			0.0273147566284224, 
			0.02691161258934004, 
			0.02610145359710178, 
			0.025670375270512892, 
			0.02530161009297528, 
			0.026151829755597978, 
			0.027139110450580945, 
			0.02861372653569757, 
			0.029884461233940608, 
			0.031181746655941433, 
			0.03214793537612248, 
			0.03297330695089444, 
			0.03346943239424273, 
			0.033795705709894576, 
			0.033828850398600945, 
			0.03372453207815819, 
			0.033374633477539654, 
			0.032988536019088896, 
			0.03245383958433955, 
			0.03212138217792743, 
			0.03183348017591355, 
			0.032120337376988134, 
			0.03245169435363621, 
			0.032985226216744594, 
			0.033369923796898335, 
			0.033718207297990604, 
			0.033820414938194106, 
			0.03378475371177524, 
			0.0334551312277155, 
			0.03295506992808607, 
			0.03212454503944849, 
			0.031152598287378076, 
			0.029848082629731855, 
			0.028570102061198394, 
			0.02708713900749917, 
			0.02609357838394859, 
			0.025237560129863206, 
			0.02560641171879711, 
			0.026037933446123797, 
			0.026850602020076386, 
			0.02725429996207222, 
			0.027500362912013306, 
			0.027073648372355475, 
			0.02625950555647652, 
			0.024624851834122156, 
			0.022581689746451705, 
			0.01967829336660195, 
			0.016691862024784766, 
			0.013193305565122299, 
			0.010860165823058907, 
			0.009572134560358504, 
			0.009337350099950103, 
			0.01035782556724069, 
			0.008550353354155714, 
			0.008021184807739244, 
			0.008300021946038325, 
			0.00884077430727143, 
			0.010005678928068803, 
			0.010092337478726262, 
			0.010314085958164404, 
			0.010045076472652924, 
			0.01190534867979755, 
			0.01687124707954561, 
			0.02296839757506691, 
			0.03131256775197154, 
			0.03779857513449495, 
			0.044429707602142286, 
			0.045307110967229926, 
			0.044469240831005855, 
			0.03552538727080951, 
			0.02922763318990802, 
			0.026335412126333273, 
			0.02860329622754713, 
			0.034129673146689236, 
			0.039419551436934167, 
			0.044649610296576124, 
			0.04861775818307895, 
			0.05190769819666602, 
			0.054036234474094044, 
			0.055607857709525546, 
			0.05633780218458637, 
			0.05689394365592174, 
			0.057017858052334724, 
			0.05761493866657349, 
			0.058298878962347714, 
			0.06025348150413614, 
			0.062242988632328924, 
			0.06459855126935611, 
			0.0666110516701493, 
			0.06852618460621565, 
			0.07002201188923271, 
			0.071306363251677, 
			0.07223772527073635, 
			0.07297898524371471, 
			0.07345731682841734, 
			0.07380626815722015, 
			0.07397307178505291, 
			0.0740965222525772, 
			0.07412433974165243, 
			0.07424672319879048, 
			0.0743853482507035, 
			0.07479916723907906, 
			0.07522535177018601, 
			0.07573920473245412, 
			0.07618263771891709, 
			0.0766099034320043, 
			0.07694616500147029, 
			0.07723743167455607, 
			0.07744977846375817, 
			0.07761982739851357, 
			0.07772990706523275, 
			0.07781053879320546, 
			0.07784901262276293, 
			0.07787751465135755, 
			0.07788360990277443, 
			0.07791197687231337, 
			0.07794421602352244, 
			0.07804189859780473, 
			0.07814282854252624, 
			0.07826507119494133, 
			0.07837082203527318, 
			0.07847302171433206, 
			0.07855360547715137, 
			0.0786235552646804, 
			0.0786746269639062, 
			0.07871559227053658, 
			0.07874214769279307, 
			0.07876162829386528, 
			0.07877094646186514, 
			0.07877785742206636, 
			0.07877935081400282, 
			0.07878621722634964, 
			0.07879401649822843, 
			0.07881765760036386, 
			0.0788421030148419, 
			0.07887173628363472, 
			0.078897396907855, 
			0.07892221768251734, 
			0.07894181552431573, 
			0.078958842807908, 
			0.07897129946506735, 
			0.07898128836791761, 
			0.07898775912809762, 
			0.07899242527122577, 
			0.07899449200030481, 
			0.07899565866571157, 
			0.07899500593890471, 
			0.07899464469116006, 
			0.07899285420223023, 
			0.07899183735359905, 
			0.07898594202875692, 
			0.07897229242139545, 
			0.0789419222557247, 
			0.0788833932322854, 
			0.0787742451840352, 
			0.07857709291062302, 
			0.07822440398279126, 
			0.07759796065833365, 
			0.07648787294065829, 
			0.07452370457020642, 
			0.07105010500744653, 
			0.06490895063807733, 
			0.054052822238804886, 
			0.034862829641366354, 
			0.0
	};
	
	public int nSteps() {
		return LeftMotorSpeeds.length;
	}
	
	public double LeftSpeed(int i) {
		return LeftMotorSpeeds[i];
	}
	public double RightSpeed(int i) {
		return RightMotorSpeeds[i];
	}

}

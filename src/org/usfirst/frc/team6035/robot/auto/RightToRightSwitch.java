package org.usfirst.frc.team6035.robot.auto;


public class RightToRightSwitch extends AutoDirection {

  private double[] leftMotorSpeeds = {
    0.000000, 1.689116, 2.635953, 3.171614, 3.474654, 3.646089, 3.743068, 3.797920, 3.828935, 3.846462, 3.856351, 3.861913, 3.865020, 3.866731, 3.867645, 3.868103, 3.868299, 3.868352, 3.868327, 3.868261, 3.868172, 3.868069, 3.867952, 3.867818, 3.867663, 3.867478, 3.867254, 3.866983, 3.866655, 3.866265, 3.865808, 3.865295, 3.864735, 3.864166, 3.863608, 3.863072, 3.862551, 3.862034, 3.861497, 3.860915, 3.860254, 3.859480, 3.858551, 3.857434, 3.856082, 3.854478, 3.852601, 3.850491, 3.848194, 3.845859, 3.843568, 3.841369, 3.839235, 3.837116, 3.834914, 3.832528, 3.829814, 3.826640, 3.822827, 3.818238, 3.812685, 3.806101, 3.798388, 3.789728, 3.780298, 3.770733, 3.761350, 3.752352, 3.743607, 3.734922, 3.725874, 3.716055, 3.704852, 3.691731, 3.675925, 3.656881, 3.633785, 3.606399, 3.574268, 3.538294, 3.499144, 3.459824, 3.421320, 3.384634, 3.348891, 3.313387, 3.276070, 3.235321, 3.188223, 3.132620, 3.064689, 2.982273, 2.880929, 2.760498, 2.617803, 2.460804, 2.292028, 2.138469, 1.998921, 1.887555, 1.794775, 1.725484, 1.668417, 1.624934, 1.585772, 1.551628, 1.515541, 1.478801, 1.435977, 1.390506, 1.338243, 1.288178, 1.237553, 1.204739, 1.178339, 1.165275, 1.155610, 1.152639, 1.149707, 1.148940, 1.146249, 1.143304, 1.137461, 1.130346, 1.119990, 1.108681, 1.094829, 1.082629, 1.070562, 1.065614, 1.062329, 1.062983, 1.063692, 1.065708, 1.066776, 1.067822, 1.067523, 1.066648, 1.064276, 1.061210, 1.056653, 1.051812, 1.045915, 1.041171, 1.036633, 1.035829, 1.035513, 1.036769, 1.037345, 1.037940, 1.037135, 1.035575, 1.032159, 1.027630, 1.020848, 1.013001, 1.002733, 0.992403, 0.980404, 0.971466, 0.963253, 0.963413, 0.964066, 0.967484, 0.968105, 0.967589, 0.962106, 0.953420, 0.938045, 0.918378, 0.890288, 0.858130, 0.816663, 0.775072, 0.726982, 0.691304, 0.658686, 0.660178, 0.663804, 0.678960, 0.682963, 0.683002, 0.663835, 0.634020, 0.581153, 0.519327, 0.438246, 0.369322, 0.313103, 0.349316, 0.470251, 0.564214, 0.654103, 0.590315, 0.512629, 0.387751, 0.323514, 0.325110, 0.363561, 0.429594, 0.482664, 0.530951, 0.556247, 0.571223, 0.565089, 0.554726, 0.531428, 0.521438, 0.513937, 0.547025, 0.584492, 0.637677, 0.684005, 0.731018, 0.767507, 0.799621, 0.821950, 0.839347, 0.848810, 0.854440, 0.854048, 0.852158, 0.846757, 0.844491, 0.842707, 0.850946, 0.860189, 0.873293, 0.884606, 0.896029, 0.904711, 0.912213, 0.917099, 0.920631, 0.921939, 0.922165, 0.920598, 0.918645, 0.915604, 0.913714, 0.912025, 0.913874, 0.916027, 0.919481, 0.922118, 0.924616, 0.925760, 0.926158, 0.924977, 0.922839, 0.918954, 0.914188, 0.907635, 0.900892, 0.892906, 0.886812, 0.881102, 0.880831, 0.880876, 0.882740, 0.882791, 0.882093, 0.878137, 0.872016, 0.861445, 0.847875, 0.828593, 0.806250, 0.777399, 0.747763, 0.713199, 0.685835, 0.659813, 0.655639, 0.652861, 0.657798, 0.655408, 0.650241, 0.631716, 0.605073, 0.561218, 0.508894, 0.439917, 0.374827, 0.312540, 0.309177, 0.395720, 0.489305, 0.595668, 0.578434, 0.538248, 0.430707, 0.337595, 0.239235, 0.193354, 0.199699, 0.215617, 0.240268, 0.248814, 0.251089, 0.233232, 0.212210, 0.177882, 0.159690, 0.146847, 0.169635, 0.201502, 0.255132, 0.303212, 0.354210, 0.394059, 0.429772, 0.454342, 0.473434, 0.483080, 0.488209, 0.485915, 0.481820, 0.473284, 0.468796, 0.464955, 0.474180, 0.484844, 0.500702, 0.514351, 0.528266, 0.538626, 0.547475, 0.552802, 0.556317, 0.556706, 0.555636, 0.551955, 0.547903, 0.542278, 0.538828, 0.535865, 0.539039, 0.542685, 0.548482, 0.552687, 0.556502, 0.557697, 0.557433, 0.554053, 0.548882, 0.540223, 0.530103, 0.516492, 0.503223, 0.487832, 0.477704, 0.469073, 0.473472, 0.478500, 0.487520, 0.492112, 0.494914, 0.490394, 0.481468, 0.463319, 0.439919, 0.405743, 0.367734, 0.319007, 0.273251, 0.221902, 0.190885, 0.166615, 0.187874, 0.211564, 0.248780, 0.271879, 0.290598, 0.288664, 0.278384, 0.248896, 0.220285, 0.187478, 0.192313, 0.248027, 0.309205, 0.390029, 0.416768, 0.432598, 0.356085, 0.319111, 0.336337, 0.393648, 0.479761, 0.555478, 0.626971, 0.679780, 0.722719, 0.749460, 0.768411, 0.775564, 0.780143, 0.778465, 0.783283, 0.789261, 0.813504, 0.838655, 0.869588, 0.896118, 0.921743, 0.941720, 0.958974, 0.971360, 0.981169, 0.987273, 0.991562, 0.993218, 0.994236, 0.993826, 0.994773, 0.995945, 1.001192, 1.006697, 1.013591, 1.019551, 1.025370, 1.029934, 1.033903, 1.036763, 1.039039, 1.040456, 1.041453, 1.041832, 1.042062, 1.041954, 1.042168, 1.042436, 1.043679, 1.044989, 1.046636, 1.048063, 1.049461, 1.050558, 1.051515, 1.052204, 1.052754, 1.053097, 1.053338, 1.053430, 1.053486, 1.053459, 1.053511, 1.053576, 1.053877, 1.054195, 1.054595, 1.054941, 1.055281, 1.055548, 1.055782, 1.055950, 1.056085, 1.056169, 1.056227, 1.056247, 1.056255, 1.056235, 1.056222, 1.056189, 1.056172, 1.056092, 1.055912, 1.055508, 1.054730, 1.053277, 1.050651, 1.045950, 1.037599, 1.022798, 0.996610, 0.950294, 0.868410, 0.723657, 0.467782, 0.000000
  };

  private double[] rightMotorSpeeds = {
    0.000000, 1.689119, 2.635959, 3.171623, 3.474667, 3.646107, 3.743092, 3.797951, 3.828976, 3.846514, 3.856417, 3.861995, 3.865122, 3.866852, 3.867787, 3.868261, 3.868471, 3.868522, 3.868494, 3.868420, 3.868330, 3.868227, 3.868121, 3.868005, 3.867880, 3.867734, 3.867565, 3.867357, 3.867109, 3.866799, 3.866433, 3.865984, 3.865481, 3.864901, 3.864328, 3.863756, 3.863224, 3.862706, 3.862210, 3.861696, 3.861158, 3.860543, 3.859841, 3.858980, 3.857960, 3.856684, 3.855183, 3.853341, 3.851282, 3.848901, 3.846551, 3.844205, 3.842024, 3.839904, 3.837875, 3.835774, 3.833578, 3.831068, 3.828209, 3.824707, 3.820558, 3.815368, 3.809265, 3.801765, 3.793383, 3.783668, 3.774080, 3.764498, 3.755606, 3.746966, 3.738729, 3.730224, 3.721377, 3.711298, 3.699874, 3.685902, 3.669421, 3.648782, 3.624583, 3.594695, 3.561294, 3.522153, 3.483573, 3.444938, 3.409415, 3.375212, 3.343344, 3.311157, 3.278895, 3.243142, 3.204357, 3.157958, 3.105636, 3.040604, 2.967345, 2.874215, 2.771553, 2.637832, 2.506107, 2.367647, 2.244855, 2.129116, 2.032953, 1.948051, 1.880902, 1.824078, 1.781174, 1.745350, 1.719370, 1.695546, 1.676995, 1.652247, 1.626344, 1.581298, 1.535738, 1.483504, 1.437345, 1.392741, 1.356477, 1.324552, 1.300283, 1.280257, 1.266244, 1.255207, 1.248433, 1.242565, 1.238925, 1.232693, 1.225937, 1.211755, 1.197364, 1.180669, 1.166240, 1.152519, 1.141793, 1.132670, 1.126283, 1.121430, 1.118813, 1.117275, 1.117445, 1.117844, 1.119178, 1.119081, 1.118649, 1.114376, 1.109977, 1.104413, 1.100117, 1.096300, 1.094383, 1.093586, 1.094949, 1.097593, 1.102587, 1.108620, 1.116991, 1.125236, 1.134951, 1.141342, 1.146841, 1.143823, 1.140432, 1.134414, 1.131421, 1.129719, 1.133116, 1.139728, 1.152971, 1.170303, 1.195772, 1.224860, 1.262744, 1.300084, 1.343289, 1.373372, 1.399975, 1.392173, 1.382639, 1.362144, 1.353791, 1.350612, 1.368514, 1.399937, 1.459419, 1.536582, 1.648745, 1.776835, 1.942696, 2.105253, 2.290188, 2.410894, 2.504152, 2.425902, 2.315949, 2.133215, 1.968613, 1.795221, 1.659152, 1.537633, 1.453046, 1.386867, 1.351442, 1.330770, 1.333760, 1.342470, 1.365014, 1.374825, 1.382527, 1.349909, 1.313047, 1.260534, 1.214863, 1.168469, 1.132526, 1.100890, 1.078967, 1.061919, 1.052756, 1.047392, 1.048027, 1.050149, 1.055779, 1.058278, 1.060297, 1.052294, 1.043264, 1.030347, 1.019182, 1.007868, 0.999249, 0.991767, 0.986852, 0.983240, 0.981797, 0.981375, 0.982678, 0.984291, 0.986918, 0.988311, 0.989445, 0.986988, 0.984231, 0.980178, 0.976964, 0.973888, 0.972156, 0.971120, 0.971591, 0.972893, 0.975787, 0.979343, 0.984438, 0.989406, 0.995308, 0.998962, 1.001982, 0.999341, 0.996432, 0.991763, 0.989050, 0.987132, 0.988477, 0.991829, 0.999372, 1.009438, 1.024611, 1.041980, 1.064878, 1.087307, 1.113444, 1.130996, 1.146273, 1.138925, 1.130549, 1.114984, 1.107783, 1.104332, 1.115606, 1.136701, 1.178025, 1.233034, 1.314739, 1.411009, 1.539096, 1.671097, 1.827602, 1.942954, 2.043349, 2.003342, 1.932635, 1.788796, 1.653300, 1.500480, 1.377276, 1.262791, 1.182068, 1.117515, 1.083609, 1.064297, 1.070055, 1.081849, 1.109043, 1.121983, 1.132472, 1.095844, 1.053486, 0.991606, 0.937107, 0.881011, 0.837166, 0.798249, 0.771118, 0.749903, 0.738466, 0.731739, 0.732558, 0.735202, 0.742287, 0.745267, 0.747588, 0.736835, 0.724775, 0.707668, 0.692968, 0.678178, 0.667121, 0.657723, 0.651980, 0.648157, 0.647557, 0.648494, 0.652113, 0.656168, 0.661850, 0.665411, 0.668530, 0.665550, 0.662120, 0.656563, 0.652618, 0.649095, 0.648234, 0.648898, 0.652760, 0.658531, 0.667930, 0.678980, 0.693730, 0.708403, 0.725458, 0.737549, 0.748356, 0.746328, 0.743645, 0.736936, 0.734554, 0.733939, 0.740660, 0.751939, 0.772686, 0.799117, 0.836880, 0.879272, 0.933298, 0.985542, 1.044586, 1.084714, 1.119193, 1.109073, 1.096698, 1.071087, 1.059881, 1.054271, 1.071705, 1.102316, 1.160585, 1.232947, 1.335040, 1.443774, 1.577600, 1.694430, 1.817213, 1.875446, 1.907349, 1.821152, 1.724180, 1.594805, 1.487074, 1.383581, 1.306664, 1.241935, 1.198990, 1.167171, 1.151682, 1.144132, 1.148455, 1.155879, 1.170099, 1.178711, 1.186582, 1.176507, 1.164497, 1.145525, 1.129243, 1.112369, 1.099613, 1.088390, 1.080983, 1.075418, 1.072986, 1.072055, 1.073568, 1.075729, 1.079376, 1.081840, 1.084154, 1.082450, 1.080220, 1.076298, 1.072880, 1.069227, 1.066449, 1.063969, 1.062338, 1.061109, 1.060597, 1.060426, 1.060826, 1.061377, 1.062281, 1.062904, 1.063492, 1.063118, 1.062612, 1.061693, 1.060889, 1.060022, 1.059362, 1.058771, 1.058382, 1.058088, 1.057967, 1.057928, 1.058026, 1.058161, 1.058382, 1.058534, 1.058678, 1.058589, 1.058467, 1.058245, 1.058050, 1.057839, 1.057678, 1.057533, 1.057436, 1.057362, 1.057328, 1.057312, 1.057326, 1.057346, 1.057378, 1.057383, 1.057365, 1.057254, 1.057068, 1.056739, 1.056205, 1.055293, 1.053731, 1.051006, 1.046228, 1.037811, 1.022961, 0.996730, 0.950382, 0.868471, 0.723696, 0.467800, 0.000000
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

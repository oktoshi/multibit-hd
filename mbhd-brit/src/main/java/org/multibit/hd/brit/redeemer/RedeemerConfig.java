package org.multibit.hd.brit.redeemer;

import com.google.bitcoin.core.ECKey;

/**
 *  <p>Configuration to provide the following to Redeemers:</p>
 *  <ul>
 *  <li>Storage of EC and PGP private and public keys used in BRIT redemption</li>
 *  </ul>
 *  </p>
 *  
 */
public class RedeemerConfig {

  private ECKey redeemerECKey;

  public RedeemerConfig(ECKey redeemerECkey) {
    this.redeemerECKey = redeemerECkey;
  }

  public ECKey getRedeemerECKey() {
    return redeemerECKey;
  }
}
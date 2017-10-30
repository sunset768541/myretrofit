package com.example.sunset.usretrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sunset on 2017/9/24.
 */

public class De {

    /**
     * 7193584 : {"SUBID":"7193584","os":"Ubuntu 16.04 x64","ram":"512 MB","disk":"Virtual 20 GB","main_ip":"45.76.213.67","vcpu_count":"1","location":"Tokyo","DCID":"25","default_password":"@K6uz@A(=,pmD$6G","date_created":"2017-03-04 12:24:45","pending_charges":"2.07","status":"active","cost_per_month":"2.50","current_bandwidth_gb":30.996,"allowed_bandwidth_gb":"500","netmask_v4":"255.255.254.0","gateway_v4":"45.76.212.1","power_status":"running","server_state":"ok","VPSPLANID":"200","v6_main_ip":"","v6_network_size":"","v6_network":"","v6_networks":[],"label":"","internal_ip":"","kvm_url":"https://my.vultr.com/subs/vps/novnc/api.php?data=NRQUOR2LGBLXUNLULBAWS5STOFVGG3CGGZKEW3SSLBXFKU3COUZFQ4LPJA4EYYTNGJBDESLPJBMEMM3CMVZHIYRLKFZDKZSSLBWFU4DKJNKGYWKMLFBDCT2RGRLXU23WMZQTENBVMN4W6NBUK5LTQTRYMNAVQZSKMN3DE53IORYWY5LEINCVU4DWO5BXSWSBOZWVKRCRNZETM6SQOR2UETRVKAVUUMLVIIZGQ6KJF5ZFATDSN5ZDGWLIM4ZU4VJPMNIU2ZZWPE2E6NTSGA6Q","auto_backups":"no","tag":"","OSID":"215","APPID":"0","FIREWALLGROUPID":"0"}
     * 10636332 : {"SUBID":"10636332","os":"Ubuntu 16.04 x64","ram":"1024 MB","disk":"Virtual 25 GB","main_ip":"45.77.24.16","vcpu_count":"1","location":"Tokyo","DCID":"25","default_password":"z6C.kE6X_erpLSKd","date_created":"2017-09-22 23:43:06","pending_charges":"0.18","status":"active","cost_per_month":"5.00","current_bandwidth_gb":0.012,"allowed_bandwidth_gb":"1000","netmask_v4":"255.255.254.0","gateway_v4":"45.77.24.1","power_status":"running","server_state":"ok","VPSPLANID":"201","v6_main_ip":"","v6_network_size":"","v6_network":"","v6_networks":[],"label":"","internal_ip":"","kvm_url":"https://my.vultr.com/subs/vps/novnc/api.php?data=KVYU6QKGJJEEIL2XLJ4DC4DUMRJUI2JZHFNDMYRXJVCSWUZQGQVTGRDOIFUXMTJZNJWEONKSGF2XSTRXMFTEC6SSNZZFI6TRFNEGU22KNIVTITKQMJBXOWTEM5XEO5ZRMVMWCSDHKRBUG2DLHEZDSZDLIQ2VMWKXNJGTMY2QJVJEK5LKPBUES3SOKFCUIRLYNBBHGRLHNRSWY3LQGVUVA3SQGU2ESM22KBRDENZZMFHW6VBRN5XESMZXMZ2EGTLGORDGY4RSGY2DCY3UNM6Q","auto_backups":"no","tag":"","OSID":"215","APPID":"0","FIREWALLGROUPID":"0"}
     */

    @SerializedName("7193584")
    private _$7193584Bean _$7193584;
    @SerializedName("10636332")
    private _$10636332Bean _$10636332;

    public _$7193584Bean get_$7193584() {
        return _$7193584;
    }

    public void set_$7193584(_$7193584Bean _$7193584) {
        this._$7193584 = _$7193584;
    }

    public _$10636332Bean get_$10636332() {
        return _$10636332;
    }

    public void set_$10636332(_$10636332Bean _$10636332) {
        this._$10636332 = _$10636332;
    }

    public static class _$7193584Bean {
        /**
         * SUBID : 7193584
         * os : Ubuntu 16.04 x64
         * ram : 512 MB
         * disk : Virtual 20 GB
         * main_ip : 45.76.213.67
         * vcpu_count : 1
         * location : Tokyo
         * DCID : 25
         * default_password : @K6uz@A(=,pmD$6G
         * date_created : 2017-03-04 12:24:45
         * pending_charges : 2.07
         * status : active
         * cost_per_month : 2.50
         * current_bandwidth_gb : 30.996
         * allowed_bandwidth_gb : 500
         * netmask_v4 : 255.255.254.0
         * gateway_v4 : 45.76.212.1
         * power_status : running
         * server_state : ok
         * VPSPLANID : 200
         * v6_main_ip :
         * v6_network_size :
         * v6_network :
         * v6_networks : []
         * label :
         * internal_ip :
         * kvm_url : https://my.vultr.com/subs/vps/novnc/api.php?data=NRQUOR2LGBLXUNLULBAWS5STOFVGG3CGGZKEW3SSLBXFKU3COUZFQ4LPJA4EYYTNGJBDESLPJBMEMM3CMVZHIYRLKFZDKZSSLBWFU4DKJNKGYWKMLFBDCT2RGRLXU23WMZQTENBVMN4W6NBUK5LTQTRYMNAVQZSKMN3DE53IORYWY5LEINCVU4DWO5BXSWSBOZWVKRCRNZETM6SQOR2UETRVKAVUUMLVIIZGQ6KJF5ZFATDSN5ZDGWLIM4ZU4VJPMNIU2ZZWPE2E6NTSGA6Q
         * auto_backups : no
         * tag :
         * OSID : 215
         * APPID : 0
         * FIREWALLGROUPID : 0
         */

        private String SUBID;
        private String os;
        private String ram;
        private String disk;
        private String main_ip;
        private String vcpu_count;
        private String location;
        private String DCID;
        private String default_password;
        private String date_created;
        private String pending_charges;
        private String status;
        private String cost_per_month;
        private double current_bandwidth_gb;
        private String allowed_bandwidth_gb;
        private String netmask_v4;
        private String gateway_v4;
        private String power_status;
        private String server_state;
        private String VPSPLANID;
        private String v6_main_ip;
        private String v6_network_size;
        private String v6_network;
        private String label;
        private String internal_ip;
        private String kvm_url;
        private String auto_backups;
        private String tag;
        private String OSID;
        private String APPID;
        private String FIREWALLGROUPID;
        private List<?> v6_networks;

        public String getSUBID() {
            return SUBID;
        }

        public void setSUBID(String SUBID) {
            this.SUBID = SUBID;
        }

        public String getOs() {
            return os;
        }

        public void setOs(String os) {
            this.os = os;
        }

        public String getRam() {
            return ram;
        }

        public void setRam(String ram) {
            this.ram = ram;
        }

        public String getDisk() {
            return disk;
        }

        public void setDisk(String disk) {
            this.disk = disk;
        }

        public String getMain_ip() {
            return main_ip;
        }

        public void setMain_ip(String main_ip) {
            this.main_ip = main_ip;
        }

        public String getVcpu_count() {
            return vcpu_count;
        }

        public void setVcpu_count(String vcpu_count) {
            this.vcpu_count = vcpu_count;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDCID() {
            return DCID;
        }

        public void setDCID(String DCID) {
            this.DCID = DCID;
        }

        public String getDefault_password() {
            return default_password;
        }

        public void setDefault_password(String default_password) {
            this.default_password = default_password;
        }

        public String getDate_created() {
            return date_created;
        }

        public void setDate_created(String date_created) {
            this.date_created = date_created;
        }

        public String getPending_charges() {
            return pending_charges;
        }

        public void setPending_charges(String pending_charges) {
            this.pending_charges = pending_charges;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCost_per_month() {
            return cost_per_month;
        }

        public void setCost_per_month(String cost_per_month) {
            this.cost_per_month = cost_per_month;
        }

        public double getCurrent_bandwidth_gb() {
            return current_bandwidth_gb;
        }

        public void setCurrent_bandwidth_gb(double current_bandwidth_gb) {
            this.current_bandwidth_gb = current_bandwidth_gb;
        }

        public String getAllowed_bandwidth_gb() {
            return allowed_bandwidth_gb;
        }

        public void setAllowed_bandwidth_gb(String allowed_bandwidth_gb) {
            this.allowed_bandwidth_gb = allowed_bandwidth_gb;
        }

        public String getNetmask_v4() {
            return netmask_v4;
        }

        public void setNetmask_v4(String netmask_v4) {
            this.netmask_v4 = netmask_v4;
        }

        public String getGateway_v4() {
            return gateway_v4;
        }

        public void setGateway_v4(String gateway_v4) {
            this.gateway_v4 = gateway_v4;
        }

        public String getPower_status() {
            return power_status;
        }

        public void setPower_status(String power_status) {
            this.power_status = power_status;
        }

        public String getServer_state() {
            return server_state;
        }

        public void setServer_state(String server_state) {
            this.server_state = server_state;
        }

        public String getVPSPLANID() {
            return VPSPLANID;
        }

        public void setVPSPLANID(String VPSPLANID) {
            this.VPSPLANID = VPSPLANID;
        }

        public String getV6_main_ip() {
            return v6_main_ip;
        }

        public void setV6_main_ip(String v6_main_ip) {
            this.v6_main_ip = v6_main_ip;
        }

        public String getV6_network_size() {
            return v6_network_size;
        }

        public void setV6_network_size(String v6_network_size) {
            this.v6_network_size = v6_network_size;
        }

        public String getV6_network() {
            return v6_network;
        }

        public void setV6_network(String v6_network) {
            this.v6_network = v6_network;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getInternal_ip() {
            return internal_ip;
        }

        public void setInternal_ip(String internal_ip) {
            this.internal_ip = internal_ip;
        }

        public String getKvm_url() {
            return kvm_url;
        }

        public void setKvm_url(String kvm_url) {
            this.kvm_url = kvm_url;
        }

        public String getAuto_backups() {
            return auto_backups;
        }

        public void setAuto_backups(String auto_backups) {
            this.auto_backups = auto_backups;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getOSID() {
            return OSID;
        }

        public void setOSID(String OSID) {
            this.OSID = OSID;
        }

        public String getAPPID() {
            return APPID;
        }

        public void setAPPID(String APPID) {
            this.APPID = APPID;
        }

        public String getFIREWALLGROUPID() {
            return FIREWALLGROUPID;
        }

        public void setFIREWALLGROUPID(String FIREWALLGROUPID) {
            this.FIREWALLGROUPID = FIREWALLGROUPID;
        }

        public List<?> getV6_networks() {
            return v6_networks;
        }

        public void setV6_networks(List<?> v6_networks) {
            this.v6_networks = v6_networks;
        }
    }

    public static class _$10636332Bean {
        /**
         * SUBID : 10636332
         * os : Ubuntu 16.04 x64
         * ram : 1024 MB
         * disk : Virtual 25 GB
         * main_ip : 45.77.24.16
         * vcpu_count : 1
         * location : Tokyo
         * DCID : 25
         * default_password : z6C.kE6X_erpLSKd
         * date_created : 2017-09-22 23:43:06
         * pending_charges : 0.18
         * status : active
         * cost_per_month : 5.00
         * current_bandwidth_gb : 0.012
         * allowed_bandwidth_gb : 1000
         * netmask_v4 : 255.255.254.0
         * gateway_v4 : 45.77.24.1
         * power_status : running
         * server_state : ok
         * VPSPLANID : 201
         * v6_main_ip :
         * v6_network_size :
         * v6_network :
         * v6_networks : []
         * label :
         * internal_ip :
         * kvm_url : https://my.vultr.com/subs/vps/novnc/api.php?data=KVYU6QKGJJEEIL2XLJ4DC4DUMRJUI2JZHFNDMYRXJVCSWUZQGQVTGRDOIFUXMTJZNJWEONKSGF2XSTRXMFTEC6SSNZZFI6TRFNEGU22KNIVTITKQMJBXOWTEM5XEO5ZRMVMWCSDHKRBUG2DLHEZDSZDLIQ2VMWKXNJGTMY2QJVJEK5LKPBUES3SOKFCUIRLYNBBHGRLHNRSWY3LQGVUVA3SQGU2ESM22KBRDENZZMFHW6VBRN5XESMZXMZ2EGTLGORDGY4RSGY2DCY3UNM6Q
         * auto_backups : no
         * tag :
         * OSID : 215
         * APPID : 0
         * FIREWALLGROUPID : 0
         */

        private String SUBID;
        private String os;
        private String ram;
        private String disk;
        private String main_ip;
        private String vcpu_count;
        private String location;
        private String DCID;
        private String default_password;
        private String date_created;
        private String pending_charges;
        private String status;
        private String cost_per_month;
        private double current_bandwidth_gb;
        private String allowed_bandwidth_gb;
        private String netmask_v4;
        private String gateway_v4;
        private String power_status;
        private String server_state;
        private String VPSPLANID;
        private String v6_main_ip;
        private String v6_network_size;
        private String v6_network;
        private String label;
        private String internal_ip;
        private String kvm_url;
        private String auto_backups;
        private String tag;
        private String OSID;
        private String APPID;
        private String FIREWALLGROUPID;
        private List<?> v6_networks;

        public String getSUBID() {
            return SUBID;
        }

        public void setSUBID(String SUBID) {
            this.SUBID = SUBID;
        }

        public String getOs() {
            return os;
        }

        public void setOs(String os) {
            this.os = os;
        }

        public String getRam() {
            return ram;
        }

        public void setRam(String ram) {
            this.ram = ram;
        }

        public String getDisk() {
            return disk;
        }

        public void setDisk(String disk) {
            this.disk = disk;
        }

        public String getMain_ip() {
            return main_ip;
        }

        public void setMain_ip(String main_ip) {
            this.main_ip = main_ip;
        }

        public String getVcpu_count() {
            return vcpu_count;
        }

        public void setVcpu_count(String vcpu_count) {
            this.vcpu_count = vcpu_count;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDCID() {
            return DCID;
        }

        public void setDCID(String DCID) {
            this.DCID = DCID;
        }

        public String getDefault_password() {
            return default_password;
        }

        public void setDefault_password(String default_password) {
            this.default_password = default_password;
        }

        public String getDate_created() {
            return date_created;
        }

        public void setDate_created(String date_created) {
            this.date_created = date_created;
        }

        public String getPending_charges() {
            return pending_charges;
        }

        public void setPending_charges(String pending_charges) {
            this.pending_charges = pending_charges;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCost_per_month() {
            return cost_per_month;
        }

        public void setCost_per_month(String cost_per_month) {
            this.cost_per_month = cost_per_month;
        }

        public double getCurrent_bandwidth_gb() {
            return current_bandwidth_gb;
        }

        public void setCurrent_bandwidth_gb(double current_bandwidth_gb) {
            this.current_bandwidth_gb = current_bandwidth_gb;
        }

        public String getAllowed_bandwidth_gb() {
            return allowed_bandwidth_gb;
        }

        public void setAllowed_bandwidth_gb(String allowed_bandwidth_gb) {
            this.allowed_bandwidth_gb = allowed_bandwidth_gb;
        }

        public String getNetmask_v4() {
            return netmask_v4;
        }

        public void setNetmask_v4(String netmask_v4) {
            this.netmask_v4 = netmask_v4;
        }

        public String getGateway_v4() {
            return gateway_v4;
        }

        public void setGateway_v4(String gateway_v4) {
            this.gateway_v4 = gateway_v4;
        }

        public String getPower_status() {
            return power_status;
        }

        public void setPower_status(String power_status) {
            this.power_status = power_status;
        }

        public String getServer_state() {
            return server_state;
        }

        public void setServer_state(String server_state) {
            this.server_state = server_state;
        }

        public String getVPSPLANID() {
            return VPSPLANID;
        }

        public void setVPSPLANID(String VPSPLANID) {
            this.VPSPLANID = VPSPLANID;
        }

        public String getV6_main_ip() {
            return v6_main_ip;
        }

        public void setV6_main_ip(String v6_main_ip) {
            this.v6_main_ip = v6_main_ip;
        }

        public String getV6_network_size() {
            return v6_network_size;
        }

        public void setV6_network_size(String v6_network_size) {
            this.v6_network_size = v6_network_size;
        }

        public String getV6_network() {
            return v6_network;
        }

        public void setV6_network(String v6_network) {
            this.v6_network = v6_network;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getInternal_ip() {
            return internal_ip;
        }

        public void setInternal_ip(String internal_ip) {
            this.internal_ip = internal_ip;
        }

        public String getKvm_url() {
            return kvm_url;
        }

        public void setKvm_url(String kvm_url) {
            this.kvm_url = kvm_url;
        }

        public String getAuto_backups() {
            return auto_backups;
        }

        public void setAuto_backups(String auto_backups) {
            this.auto_backups = auto_backups;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getOSID() {
            return OSID;
        }

        public void setOSID(String OSID) {
            this.OSID = OSID;
        }

        public String getAPPID() {
            return APPID;
        }

        public void setAPPID(String APPID) {
            this.APPID = APPID;
        }

        public String getFIREWALLGROUPID() {
            return FIREWALLGROUPID;
        }

        public void setFIREWALLGROUPID(String FIREWALLGROUPID) {
            this.FIREWALLGROUPID = FIREWALLGROUPID;
        }

        public List<?> getV6_networks() {
            return v6_networks;
        }

        public void setV6_networks(List<?> v6_networks) {
            this.v6_networks = v6_networks;
        }
    }
}

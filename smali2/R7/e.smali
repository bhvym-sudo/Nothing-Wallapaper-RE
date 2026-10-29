.class public abstract LR7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;)Ljava/lang/String;
    .registers 2

    const-string v0, "wallpaperId"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    packed-switch v0, :pswitch_data_56

    :pswitch_c
    goto :goto_51

    :pswitch_d
    const-string v0, "wallpaper8"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_51

    :cond_16
    const-string p0, "wallpaper_geototem1_light"

    return-object p0

    :pswitch_19
    const-string v0, "wallpaper5"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto :goto_51

    :cond_22
    const-string p0, "wallpaper_underground_dark"

    return-object p0

    :pswitch_25
    const-string v0, "wallpaper4"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2e

    goto :goto_51

    :cond_2e
    const-string p0, "wallpaper_dog_black"

    return-object p0

    :pswitch_31
    const-string v0, "wallpaper3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3a

    goto :goto_51

    :cond_3a
    const-string p0, "wallpaper_abstract_multicolour"

    return-object p0

    :pswitch_3d
    const-string v0, "wallpaper2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_46

    goto :goto_51

    :cond_46
    const-string p0, "wallpaper_flower_purple"

    return-object p0

    :pswitch_49
    const-string v0, "wallpaper1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_52

    :goto_51
    return-object p0

    :cond_52
    const-string p0, "wallpaper_flower_blue"

    return-object p0

    nop

    :pswitch_data_56
    .packed-switch -0x5b244d91
        :pswitch_49
        :pswitch_3d
        :pswitch_31
        :pswitch_25
        :pswitch_19
        :pswitch_c
        :pswitch_c
        :pswitch_d
    .end packed-switch
.end method

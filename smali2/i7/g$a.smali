.class public final Li7/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li7/g;-><init>(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Li7/g;


# direct methods
.method constructor <init>(Li7/g;)V
    .registers 2

    iput-object p1, p0, Li7/g$a;->a:Li7/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .registers 3

    iget-object p0, p0, Li7/g$a;->a:Li7/g;

    invoke-static {p0}, Li7/g;->d(Li7/g;)LI8/A;

    move-result-object p0

    sget-object p1, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;->T:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$a;

    sget-object p2, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    invoke-virtual {p2}, Lcom/nothing/wallpaper/NTPickerApplication$a;->a()Landroid/app/Application;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$a;->a(Landroid/content/Context;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, LI8/A;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.class public abstract Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$End;,
        Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Loading;,
        Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$None;,
        Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Silence;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .registers 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getSimpleName(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

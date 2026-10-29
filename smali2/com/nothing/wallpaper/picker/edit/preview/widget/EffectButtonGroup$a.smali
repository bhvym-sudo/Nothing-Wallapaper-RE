.class public final enum Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum q:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

.field public static final enum r:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

.field public static final enum s:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

.field private static final synthetic t:[Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

.field private static final synthetic u:Lo8/a;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    const-string v1, "BLUR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->q:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    new-instance v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    const-string v1, "GLASS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    new-instance v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    const-string v1, "CUSTOMIZE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->s:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    invoke-static {}, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->d()[Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    move-result-object v0

    sput-object v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->t:[Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    invoke-static {v0}, Lo8/b;->a([Ljava/lang/Enum;)Lo8/a;

    move-result-object v0

    sput-object v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->u:Lo8/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic d()[Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;
    .registers 3

    sget-object v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->q:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    sget-object v1, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    sget-object v2, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->s:Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    filled-new-array {v0, v1, v2}, [Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;
    .registers 2

    const-class v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    return-object p0
.end method

.method public static values()[Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;
    .registers 1

    sget-object v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;->t:[Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/nothing/wallpaper/picker/edit/preview/widget/EffectButtonGroup$a;

    return-object v0
.end method

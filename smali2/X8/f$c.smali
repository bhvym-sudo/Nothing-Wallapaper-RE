.class public abstract LX8/f$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX8/f$c$b;
    }
.end annotation


# static fields
.field public static final a:LX8/f$c$b;

.field public static final b:LX8/f$c;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LX8/f$c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX8/f$c$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LX8/f$c;->a:LX8/f$c$b;

    new-instance v0, LX8/f$c$a;

    invoke-direct {v0}, LX8/f$c$a;-><init>()V

    sput-object v0, LX8/f$c;->b:LX8/f$c;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LX8/f;LX8/m;)V
    .registers 3

    const-string p0, "connection"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "settings"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract c(LX8/i;)V
.end method

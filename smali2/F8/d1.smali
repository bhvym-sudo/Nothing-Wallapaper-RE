.class public final LF8/d1;
.super Lm8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/d1$a;
    }
.end annotation


# static fields
.field public static final s:LF8/d1$a;


# instance fields
.field public r:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LF8/d1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF8/d1$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LF8/d1;->s:LF8/d1$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    sget-object v0, LF8/d1;->s:LF8/d1$a;

    invoke-direct {p0, v0}, Lm8/a;-><init>(Lm8/i$c;)V

    return-void
.end method

.class public abstract LF8/o0;
.super LF8/I;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/o0$a;
    }
.end annotation


# static fields
.field public static final s:LF8/o0$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LF8/o0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF8/o0$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LF8/o0;->s:LF8/o0$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, LF8/I;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract close()V
.end method

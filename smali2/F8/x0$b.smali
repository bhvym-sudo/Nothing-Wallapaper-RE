.class public final LF8/x0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm8/i$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field static final synthetic q:LF8/x0$b;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LF8/x0$b;

    invoke-direct {v0}, LF8/x0$b;-><init>()V

    sput-object v0, LF8/x0$b;->q:LF8/x0$b;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

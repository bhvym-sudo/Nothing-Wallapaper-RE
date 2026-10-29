.class public final LF8/J$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm8/i$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic q:LF8/J$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LF8/J$a;

    invoke-direct {v0}, LF8/J$a;-><init>()V

    sput-object v0, LF8/J$a;->q:LF8/J$a;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

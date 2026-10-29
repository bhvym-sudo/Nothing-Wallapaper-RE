.class public final LM8/e;
.super LM8/g;
.source "SourceFile"


# static fields
.field public static final a:LM8/e;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LM8/e;

    invoke-direct {v0}, LM8/e;-><init>()V

    sput-object v0, LM8/e;->a:LM8/e;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, LM8/g;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .registers 3

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method

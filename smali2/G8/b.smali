.class public final LG8/b;
.super Lm8/a;
.source "SourceFile"

# interfaces
.implements LF8/J;


# instance fields
.field private volatile _preHandler:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .registers 2

    sget-object v0, LF8/J;->d:LF8/J$a;

    invoke-direct {p0, v0}, Lm8/a;-><init>(Lm8/i$c;)V

    iput-object p0, p0, LG8/b;->_preHandler:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b0(Lm8/i;Ljava/lang/Throwable;)V
    .registers 3

    return-void
.end method
